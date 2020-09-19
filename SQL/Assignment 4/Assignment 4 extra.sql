-- Tạo table với các ràng buộc và kiểu dữ liệu--

DROP DATABASE IF EXISTS extra_Assignment;
CREATE DATABASE extra_Assignment;
USE extra_Assignment;

CREATE TABLE Department (
Department_Number    	TINYINT AUTO_INCREMENT PRIMARY KEY,
Department_Name      	VARCHAR(50)
);

CREATE TABLE Employee_Table (
Employee_Number      	TINYINT AUTO_INCREMENT PRIMARY KEY,
Employee_Name			VARCHAR(50),
Department_Number		TINYINT,
FOREIGN KEY (Department_Number) REFERENCES Department(Department_Number)
);

CREATE TABLE Employee_Skill_Table (
Employee_Number			TINYINT AUTO_INCREMENT PRIMARY KEY,
Skill_Code				VARCHAR(10),
Date_Registered 		DATETIME
);

--  Thêm ít nhất 10 bản ghi vào table
INSERT INTO Department(Department_Number, Department_Name)
VALUES 
						(1, 	'Marketing'		),
						(2, 	'Sale'			),
						(3, 	'Bảo vệ'		),
						(4, 	'Nhân sự'		),
						(5, 	'Kỹ thuật'		),
						(6, 	'Tài chính'		),
						(7, 	'Phó giám đốc'	),
						(8, 	'Giám đốc'		),
						(9, 	'Thư kí'		),
						(10,	'Bán hàng'		);
                        
INSERT INTO Employee_Table(Employee_Number, Employee_Name, Department_Number)
VALUES 
						(1, 'Nguyen Hai Dang'		, '1'),
						(2, 'Nguyen Chien Thang'	, '1'),
						(3, 'Nguyen Van Chien'		, '2'),
						(4, 'Duong Do'				, '3'),
						(5, 'Nguyen Chien Thang'	, '3'),
						(6, 'Ngo Ba Kha'			, '5'),
						(7, 'Bui Xuan Huan'			, '3'),
						(8, 'Nguyen Thanh Tung'		, '4'),
						(9, 'Duong Van Huu'			, '8'),
						(10,'Vi Ti Ai'				, '8');
INSERT INTO Employee_Skill_Table (Employee_Number, Skill_Code, 	Date_Registered)

VALUES
								(1, 				'Java'		,	'2019-04-05'),
								(2, 				'ASP.NET'	,	'2019-04-05'),
								(3, 				'Java'		,	'2019-04-07'),
								(4, 				'SQL'		,	'2020-04-08'),
								(5, 				'Postman'	,	'2020-04-10'),
								(6, 				'Ruby'		,	'2020-04-05'),
								(7, 				'Python'	,	'2020-04-05'),
								(8, 				'C++'		,	'2020-04-07'),
								(9, 				'C Sharp'	,	'2020-04-07'),
								(10,				'PHP'		,	'2020-04-08');


--  Viết lệnh để lấy ra danh sách nhân viên (name) có skill JaVA
SELECT *
FROM Employee_Table ET
JOIN Employee_Skill_Table EST ON ET.Employee_Number = EST.Employee_Number
WHERE Skill_Code like 'Java';

--  Viết lệnh để lấy ra danh sách các phòng ban có >= 2 nhân viên
SELECT D.Department_Name , COUNT(ET.Department_Number)
FROM Department D
JOIN Employee_Table ET ON D.Department_Number = ET.Department_Number
GROUP BY ET.Department_Number
HAVING COUNT(ET.Department_Number) >= 2;

--  Viết lệnh để lấy ra danh sách nhân viên của mỗi văn phòng ban. 
SELECT D.Department_Name, ET.Employee_Name
FROM Department D
CROSS JOIN Employee_Table ET ON D.Department_Number= ET.Department_Number;
--  Viết lệnh để lấy ra danh sách nhân viên có > 1 skills.
SELECT EST.Employee_Number, ET.Employee_Name,COUNT(EST.Employee_Number) AS SKILLS
FROM Employee_Skill_Table EST
JOIN Employee_Table ET ON EST.Employee_Number = ET.Employee_Number
GROUP BY EST.Employee_Number
HAVING COUNT(EST.Employee_Number) >1


