-- Testing_System_Assignment_3
--  lấy ra tất cả các phòng ban
SELECT departmentName FROM testing_system.department;

-- lấy ra id của phòng ban "Sale"
SELECT DepartmentID FROM testing_system.department
WHERE (departmentID=2);

-- lấy ra thông tin account có full name dài nhất
SELECT MAX(LENGTH(Fullname)) FROM `Account`; -- tinh do dai ten 
SELECT * FROM `Account` WHERE LENGTH(Fullname) =(SELECT MAX(LENGTH(Fullname)) FROM `Account`); -- lay ra nhung fullname dai nhat

-- Lấy ra thông tin account có full name dài nhất và thuộc phòng ban có id =3
SELECT * FROM `Account` WHERE LENGTH(Fullname) =(SELECT MAX(LENGTH(Fullname)) FROM `Account`) AND DepartmentID = 3;

-- Lấy ra tên group đã tham gia trước ngày 20/12/2019
SELECT * FROM `group` ;-- lay bang GROUP
SELECT * FROM `group` WHERE createdate < '2019-12-20';

-- Lấy ra ID của question có >= 4 câu trả lời
SELECT * FROM  question; -- lay bang question


-- Lấy ra các mã đề thi có thời gian thi >= 60 phút và được tạo trước ngày 20/12/2019
SELECT * FROM exam; -- lay ra bang exam
SELECT * FROM exam WHERE Duration >= 60 AND CreateDate < 2019-12-20;

-- Lấy ra 5 group được tạo gần đây nhất
SELECT * FROM `group`
ORDER BY CreateDate DESC  	-- sap xep theo thoi gian gan nhat
LIMIT 5;  					-- gioi han 5 muc

-- Đếm số nhân viên thuộc department có id = 2
SELECT 	COUNT(AccountID) AS 'so nhanvien' FROM `account` WHERE 	DepartmentID = 2;

-- Lấy ra nhân viên có tên bắt đầu bằng chữ "D" và kết thúc bằng chữ "o"
SELECT fullname FROM `account` -- lay ra truong fullname
 WHERE fullname LIKE 'D%o';
 
 -- Xóa tất cả các exam được tạo trước ngày 20/12/2019
 SELECT * FROM exam; 		-- lay ra bang exam
 DELETE FROM exam WHERE CreateDate < '2020-12-20';
 
 -- Xóa tất cả các question có nội dung bắt đầu bằng từ "câu hỏi"
 SELECT * FROM question;      -- lay ra bang question
 DELETE FROM question WHERE Content = 'Cau hoi';
 
 -- Update thông tin của account có id = 5 thành tên "Nguyễn Bá Lộc" và mail thành loc.nguyenba@vti.com.vn
SELECT * FROM  `account`;    -- lay ra bang account
UPDATE `account` SET fullname = 'Nguyen Ba Loc',
					   Email = 'loc.nguyenba@vti.com.vn'
WHERE AccountID = 5;

-- update account có id = 5 sẽ thuộc group có id = 4
SELECT * FROM groupaccount;
UPDATE groupaccount SET AccountID = 5 WHERE GroupID=4;
 
