-- 1. Tạo table với các ràng buộc và kiểu dữ liệu 

DROP DATABASE IF EXISTS 	Thuc_tap;
CREATE DATABASE 			Thuc_tap;
USE 						Thuc_tap;

CREATE TABLE GiangVien (
	MaGV					SMALLINT AUTO_INCREMENT PRIMARY KEY,
    HoTen					NVARCHAR(50),
    Luong					INT
);

CREATE TABLE SinhVien (
	MaSV					SMALLINT AUTO_INCREMENT PRIMARY KEY,
    HoTen					NVARCHAR(50),
    NamSinh					DATE,
    QueQuan					NVARCHAR(100)
);

CREATE TABLE DeTai    (
	MaDT					SMALLINT AUTO_INCREMENT PRIMARY KEY,
    TenDT					NVARCHAR(50) UNIQUE KEY,
    KinhPhi					INT,
    NoiThucTap				NVARCHAR(100)
);

CREATE TABLE HuongDan (
	ID						SMALLINT AUTO_INCREMENT PRIMARY KEY,
    MaSV					SMALLINT,
    MaDT					SMALLINT,
    MaGV					SMALLINT,
    KetQua					ENUM('Pass', 'Fail'),
FOREIGN KEY (MaSV) REFERENCES SinhVien(MaSV) ON DELETE CASCADE,
FOREIGN KEY (MaDT) REFERENCES DeTai(MaDT),
FOREIGN KEY (MaGV) REFERENCES GiangVien(MaGV)
);

-- Thêm ít nhất 3 bản ghi vào table
INSERT INTO GiangVien 	(MaGV, 				HoTen,				   	 Luong)
VALUES 					(1, 		'Nguyễn Thị Thuỷ Chung',	 '10000000'),
						(2, 		'Lê Xuân Tân'		   ,	 '15000000'),
                        (3, 		'Phạm Thị Xuân San'    ,	 '9000000' );

INSERT INTO SinhVien 	(MaSV, HoTen, 			NamSinh,	 	   QueQuan 	 )
VALUES					(1, 'Vũ Thị Thắm'     , '1997-04-10',	   'Hà Nội'	 ),
						(2, 'Lê Đức Long'     , '1997-08-23',	   'Hưng Yên'),
                        (3, 'Nguyên Như Dương', '1997-01-12',      'Hưng Yên');
                        
INSERT INTO DeTai(MaDT, 		TenDT, 			KinhPhi, 		NoiThucTap)
VALUES 					 (1,	 'Bảo vệ Môi Trường' , '900000' ,	 'Q.Cầu Giấy'		),
						(2,	 'Biến đổi khí hậu'  , '1500000',	 'Q.Hai Bà Trưng'	),
						(3,	 'Tai Nạn Giao Thông', '1100000',	 'Q.Ba Đình'		);
                 
INSERT INTO HuongDan 	(ID, 	MaSV, 	MaDT, 	MaGV, 	KetQua)
VALUES 					(1, 	1, 		2, 		3,		'Pass'),
						(2, 	3, 		1, 		1,		'Pass'),
                        (3, 	2, 		3, 		2,		'Fail');
                        
                        
-- 2. Viết lệnh để
					-- a) Lấy tất cả các sinh viên chưa có đề tài hướng dẫn
SELECT HoTen
FROM SinhVien;
					-- b) Lấy ra số sinh viên nghiên cứu đề tài 'Bảo vệ Môi Trường'
SELECT DT.TenDT, COUNT(MaSV) AS Số_SV_cần_tìm
FROM DeTai DT
JOIN HuongDan HD ON HD.MaDT= DT.MaDT
WHERE DT.TenDT LIKE 'Bảo vệ Môi Trường';

-- 3. Tạo view có tên là "SinhVienInfo" lấy các thông tin về học sinh bao gồm: mã số, họ tên và tên đề tài
      -- (Nếu sinh viên chưa có đề tài thì column tên đề tài sẽ in ra "Chưa có")
DROP VIEW IF EXISTS SinhVienInfo;
CREATE VIEW SinhVienInfo AS 
		SELECT SV.MaSV, SV.HoTen, DT.TenDT
        FROM HuongDan HD
        JOIN DeTai DT ON HD.MaDT = DT.MaDT
        JOIN SinhVien SV ON HD.MaSV = SV.MaSV;
SELECT *
FROM SinhVienInfo;

-- 4. Tạo trigger cho table SinhVien khi insert sinh viên có năm sinh <= 1900 thì hiện ra thông báo "năm sinh phải > 1900"
DROP TRIGGER IF EXISTS Insert_SV;
DELIMITER $$
CREATE TRIGGER Insert_SV
BEFORE INSERT ON SinhVien
FOR EACH ROW 
	BEGIN 
		DECLARE Nhap_Date_SV DATE;
        SELECT NEW.NamSinh INTO Nhap_Date_SV;
        IF Nhap_Date_SV <= '1900-01-01' THEN SIGNAL SQLSTATE '12345'
										SET MESSAGE_TEXT = 'năm sinh phải > 1900';
		END IF;
	END $$
DELIMITER ;
-- insert ví dụ 
INSERT INTO SinhVien (MaSV, HoTen, 			NamSinh,	 	   QueQuan 	 )
VALUES 			(4, 'Ngộ Không' , '1899-10-12', 'Trung Quốc');

--  5. Hãy cấu hình table sao cho khi xóa 1 sinh viên nào đó thì sẽ tất cả thông tin trong table HuongDan liên quan tới sinh viên đó SẼ BỊ XOÁ ĐI
		-- cấu hình table HuongDan phần FOREIGN KEY theo ON DELETE CASCADE.
DELETE 
FROM SinhVien
WHERE MaSv=3; -- Ví dụ xoá sinh viên có MaSV = 3.
-- check lại bảng HuongDan
SELECT * 
FROM HuongDan;
                        