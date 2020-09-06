DROP DATABASE IF EXISTS QuanlyFresher;
CREATE DATABASE QuanlyFresher;
USE QuanlyFresher;

CREATE TABLE Quanly(
TraineeID           	TINYINT,
Fullname				VARCHAR(50),
Birth_Date				DATE,
Gender					VARCHAR(20),
ET_IQ					SMALLINT,
ET_Gmath				SMALLINT,
ET_English				SMALLINT,
Training_class          TINYINT,
Evaluation_Notes		VARCHAR(50)
);

--  Thêm ít nhất 10 bản ghi vào table

INSERT INTO Quanly(TraineeID, Fullname, Birth_Date, Gender, ET_IQ, ET_Gmath, ET_English, Training_class, Evaluation_Notes)
VALUES
                  (1, 'Nguyễn Hải Đăng'		,'1993-12-01',  'M', '10','6','8','6', 'tot'		),
                  (2, 'Nguyen Bach Chien'	,'1995-06-07',	'M', '9' ,'6','7','7', 'kha' 		),
                  (3, 'Nguyen Van Chien'	,'1994-03-01',	'M', '9' ,'7','6','6', 'trung binh' ),
                  (4, 'Duong Van Do'		,'1993-06-06',	'M', '6' ,'8','7','8', 'tot'		),
                  (5, 'Nguyen Chien Thang'	,'1999-10-01',	'M', '7' ,'8','8','7', 'tot' 		),
                  (6, 'Ngo Ba Kha'			,'2000-03-05',	'M', '8' ,'8','7','6', 'kha' 		),
                  (7, 'Bui Xuan Huan'		,'2000-06-07',	'M', '8' ,'8','9','8', 'trung binh' ),
                  (8, 'Nguyen Thanh Tung'	,'1998-08-02',	'M', '6' ,'9','9','8', 'tot' 		),
                  (9, 'Duong Van Huu'		,'1997-02-08',	'M', '5' ,'10','8','8','tot' 		),
                  (10,'Vi Ti Ai'			,'1997-03-08',  'F', '10','5','9','6', 'kha' 		);
                  
-- Viết lệnh để lấy ra tất cả các thực tập sinh đã vượt qua bài test đầu vào,nhóm chúng thành các tháng sinh khác nhau
	SELECT * FROM Quanly
    GROUP BY MONTH(Birth_Date);
    
--  Viết lệnh để lấy ra thực tập sinh có tên dài nhất, lấy ra các thông tin sau:tên, tuổi, các thông tin cơ bản (như đã được định nghĩa trong table)


SELECT 
    *
FROM
    Quanly
WHERE
    LENGTH(fullname) = (SELECT 
            MAX(LENGTH(fullname))
        FROM
            Quanly);

--  Viết lệnh để lấy ra tất cả các thực tập sinh là ET, 1 ET thực tập sinh lànhững người đã vượt qua bài test đầu vào và thỏa mãn số điểm như sau:
--  ET_IQ + ET_Gmath>= 15
-- ET_IQ>=7
-- ET_Gmath>=7
-- ET_English>=7
SELECT *
FROM Quanly
WHERE  ET_IQ + ET_Gmath>= 15 AND ET_IQ>= 7 AND ET_Gmath>=7 AND ET_English>= 7;

-- xóa thực tập sinh có TraineeID = 3
DELETE FROM Quanly
WHERE TraineeID = 3;


--  Thực tập sinh có TraineeID = 5 được chuyển sang lớp "2". Hãy cập nhậtthông tin vào database
UPDATE quanly
SET Training_class=2
WHERE TraineeID = 5;
