-- a) -- Tạo table với các ràng buộc kiểu dữ liệu 
DROP DATABASE IF EXISTS Assignment_6;
CREATE DATABASE 		Assignment_6;
USE 					Assignment_6;

CREATE TABLE Project_Modules  (
	ModuleID 							SMALLINT AUTO_INCREMENT PRIMARY KEY,
    ProjectID							SMALLINT ,
    EmployeeID							SMALLINT ,
    ProjectModulesDate					DATE,
    ProjectModulesCompletedOn			DATE,
    ProjectModulesDescription			VARCHAR (500)
    ); 
CREATE TABLE Projects (
	ProjectID							SMALLINT AUTO_INCREMENT PRIMARY KEY,
    ManagerID							SMALLINT UNIQUE KEY,
    ProjectName							VARCHAR(100),
    ProjectSartDate						DATE,
    ProjectDescription					VARCHAR(500),
    ProjectDetailt						VARCHAR(1000),
    ProjectCompletedOn					DATE DEFAULT(NOW())
    );
CREATE TABLE Employee (
	EmployeeID							SMALLINT AUTO_INCREMENT PRIMARY KEY,
    EmployeeFisrtName 					VARCHAR(50),
    EmployeeLastName					VARCHAR(50),
    EmployeeHireDate					DATE,
    EmployeeStatus 						ENUM('YES', 'NO'),
    SupervisorID 						SMALLINT UNIQUE,
    SocialScurityNumber 				INT
    );
CREATE TABLE Work_done (
	WorkDoneID							SMALLINT AUTO_INCREMENT PRIMARY KEY,
    EmployeeID							SMALLINT,
    ModuleID							SMALLINT,
	WorkDoneDate						DATE DEFAULT(NULL),
    WorkDoneDescription					VARCHAR(1000),
    WorkDoneStatus 						ENUM('YES', 'NO'),
    FOREIGN KEY (EmployeeID) REFERENCES Employee(EmployeeID),
    FOREIGN KEY (ModuleID) REFERENCES Project_Modules(ModuleID)
    );
    


-- ----thêm ít nhất 3 bản ghi vào mỗi table trên
INSERT INTO Project_Modules ( ModuleID, ProjectID, EmployeeID, ProjectModulesDate, ProjectModulesCompletedOn, ProjectModulesDescription)
VALUES 						(1 , 		1 , 		2, 			'2019-05-01', 		'2019-11-01',				'du_an_nua_nam'),
							(2 , 		3 , 		3, 			'2018-01-01', 		'2018-12-01',				'du_an_mot_nam'),
                            (3 , 		2 , 		1, 			'2020-03-01', 		'2020-09-20',				'du_an_nua_nam');

INSERT INTO Projects (ProjectID, ManagerID, ProjectName, ProjectSartDate, ProjectDescription, ProjectDetailt, ProjectCompletedOn)
VALUES 				 (1, 		02,		 'Thi_cong_toa_nha'	,'2019-01-01' ,'khong_biet'	 ,		'dang_xac_thuc', '2019-06-01'),
					 (2, 		01,		 'Thi_cong_cau'		,'2017-01-01' ,'chua_ro'	 ,		'dang_tim'     , '2018-01-01'),
                     (3, 		03,		 'Thi_cong_duong'	,'2019-12-12' ,'dang_xem_xet',		'unknown'	   , '2020-05-01');

INSERT INTO Employee (EmployeeID, EmployeeFisrtName, EmployeeLastName, EmployeeHireDate, EmployeeStatus, SupervisorID, SocialScurityNumber)
VALUES               (1, 	'Tham' ,	'Vu' 		,	'1997-04-10',	 'YES',			'1',	'0969'),
					 (2, 	'Long' ,	'Le' 		,	'1997-08-23',	 'NO' ,			'2',	'0948'),
                     (3, 	'Duong',	'Nguyen'	,	'1997-01-01',	 'NO' ,			'3',	'0122');
                     
INSERT INTO Work_done (WorkDoneID, EmployeeID, ModuleID, WorkDoneDate, WorkDoneDescription, WorkDoneStatus)
VALUES 				  (1 , '1' , '2' , '2019-01-01', 'hoan_thanh', 'YES'),
					  (2 , '3' , '3' , '2018-01-02', 'hoan_thanh', 'YES'),
                      (3 , '2' , '1' , '2020-09-01', 'hoan_thanh', 'NO' );
                      
-- b) Viết stored procedure (không có parameter) để Remove tất cả thông tin
		-- project đã hoàn thành sau 3 tháng kể từ ngày hiện. In số lượng record đã remove từ các table liên quan trong khi removing (dùng lệnh print)


    
