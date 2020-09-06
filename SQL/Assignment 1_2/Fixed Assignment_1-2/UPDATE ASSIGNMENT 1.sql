DROP DATABASE IF EXISTS Testing_System;
CREATE DATABASE Testing_System;
USE Testing_System;

-- tao bang department
CREATE TABLE Department (
DepartmentID 			     tinyint unsigned AUTO_INCREMENT primary key,
DepartmentName				 VARCHAR (30)  NOT NULL UNIQUE KEY
);

-- tao bang Position
CREATE TABLE Position (
PositionID 					tinyint UNSIGNED AUTO_INCREMENT primary key,
PositionName 				VARCHAR (30) UNIQUE KEY
);

-- tao bang account
CREATE TABLE `Account` (
AccountID 					tinyint AUTO_INCREMENT PRIMARY key,
Email						VARCHAR (30) UNIQUE KEY,
Username 			 		VARCHAR (30) UNIQUE KEY,
Fullname					VARCHAR (30),
DepartmentID 				TINYINT UNSIGNED ,
PositionID					TINYINT UNSIGNED ,
CreateDate					DATETIME DEFAULT NOW(),
FOREIGN KEY(DepartmentID) REFERENCES Department(DepartmentID),
FOREIGN KEY(PositionID) REFERENCES `Position`(PositionID)
);
CREATE TABLE `Group` (
GroupID 					TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
GroupName					VARCHAR (30) UNIQUE KEY,
CreatorID					TINYINT UNSIGNED,
CreateDate					DATETIME DEFAULT NOW()
);
CREATE TABLE GroupAccount (
    GroupID 				TINYINT UNSIGNED AUTO_INCREMENT,
    AccountID 				TINYINT UNSIGNED,
    JoinDate 				DATETIME DEFAULT NOW(),
    PRIMARY KEY(GroupID, AccountID)
);
CREATE TABLE TypeQuestion (
TypeID 						TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
TypeName					varchar (30) UNIQUE KEY
);
CREATE TABLE CategoryQuestion (
CategoryID					TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
CategoryName 				VARCHAR (30) UNIQUE KEY
);
CREATE TABLE Question(
    QuestionID				TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Content					VARCHAR(50) NOT NULL,
    CategoryID				TINYINT UNSIGNED NOT NULL,
    TypeID					TINYINT UNSIGNED NOT NULL,
    CreatorID				TINYINT UNSIGNED NOT NULL UNIQUE KEY,
    CreateDate				DATETIME DEFAULT NOW()
);
CREATE TABLE Answer (
AnswerID					TINYINT AUTO_INCREMENT PRIMARY KEY,
QuestionID 					TINYINT UNSIGNED,
Content						VARCHAR (50),
isCorrect					BIT
);
CREATE TABLE Exam (
ExamID						TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
`code` 						VARCHAR(30),
Title						VARCHAR (30),
CategoryID					TINYINT UNSIGNED NOT NULL,
Duration					TINYINT UNSIGNED NOT NULL,
CreatorID					TINYINT UNSIGNED NOT NULL,
CreateDate 					DATETIME DEFAULT now()
);
CREATE TABLE ExamQuestion (
ExamID 						TINYINT UNSIGNED NOT NULL,
QuestionID					TINYINT UNSIGNED NOT NULL
);


-- insert data vao 11 bang thong tin
INSERT INTO Department(DepartmentID, DepartmentName)
VALUES 
						(1,  'Marketing'	),
						(2,  'Sale'			),
						(3,  'Security'		),
						(4,  'person'		),
						(5,  'Kythuat'		);


INSERT INTO `position`(PositionID, PositionName)
VALUES 
						(1, 'Giam doc'		),
                        (2, 'Pho giam doc'	),
                        (3, 'Thu ky'		),
                        (4, 'Bao ve'		),
                        (5, 'Sale'			);


INSERT INTO `account`(AccountID, Email, Username, Fullname, DepartmentID, PositionID, CreateDate)
VALUES 
						(1, 'nguyenvana@gmail.com', 'user1', 'Nguyen Van A', '5', '1', '2020-05-01'),
                        (2, 'nguyenvanb@gmail.com', 'user2', 'Nguyen Van B', '3', '3', '2020-03-03'),
                        (3, 'nguyenvanc@gmail,com', 'user3', 'Nguyen Van C', '4', '2', '2020-04-02'),
                        (4, 'nguyenvand@gmail.com', 'user4', 'Nguyen Van D', '2', '4', '2020-02-04'),
                        (5, 'nguyenvane@gmail.com', 'user5', 'Nguyen Van E', '1', '5', '2020-01-05');


INSERT INTO `group`(GroupID, GroupName, CreatorID, CreateDate)
VALUES 
						(1, 'group1', '5', '2020-05-05'),
                        (2, 'group2', '1', '2020-01-01'),
                        (3, 'group3', '3', '2020-03-03'),
                        (4, 'group4', '4', '2020-04-04'),
                        (5, 'group5', '2', '2020-02-02');
                        
INSERT INTO `GroupAccount`(GroupID, AccountID, JoinDate)
VALUES
						(1, '4', '2020-01-04'),
                        (2, '3', '2020-02-03'),
                        (3, '2', '2020-03-02'),
                        (4, '1', '2020-04-01'),
                        (5, '5', '2020-05-05');
                        
INSERT INTO TypeQuestion(TypeID, TypeName)
VALUES 
						(1, 'Essay'				), 
						(2, 'Multiple-Choice'	);
                        
INSERT INTO CategoryQuestion(CategoryID, CategoryName)
VALUES 
						(1, 'Java'			),
                        (2, 'ASP.NET'		),
                        (3, 'ADO.NET'		),
                        (4, 'Postman'		),
                        (5, 'Python'		);
                        
INSERT INTO Question(QuestionID, Content, CategoryID, TypeID, CreatorID	, CreateDate )
VALUES 
						(1, 'Hoi ve Java'    , '2', '2', '1', '2020-06-02'),
                        (2, 'Hoi ve ASP.NET' , '4', '1', '2', '2020-06-04'),
                        (3, 'Hoi ve ADO.NET' , '1', '1', '3', '2020-06-01'),
                        (4, 'Hoi ve Postman' , '5', '2', '4', '2020-06-05'),
                        (5, 'Hoi ve Python'  , '3', '1', '5', '2020-06-03');
                        
INSERT INTO Answer(AnswerID, Content, QuestionID, isCorrect	)
VALUES 
						(1, 'Tra loi 1', '1', 1),
                        (2, 'Tra loi 2', '1', 0),
                        (3, 'Tra loi 3', '3', 0),
                        (4, 'Tra loi 4', '4', 1),
                        (5, 'Tra loi 5', '2', 1);

INSERT INTO Exam(ExamID, `Code`, Title, CategoryID, Duration, CreatorID, CreateDate )
VALUES 
						(1, 'VTI1', 'Hoi ve Java  ' , '2', '70' ,'5', '2020-05-05'  ),
                        (2, 'VTI2', 'Hoi ve ASP.NET', '4', '60' ,'1', '2020-01-01'  ),
                        (3, 'VTI3', 'Hoi ve ADO.NET', '1', '90' ,'2', '2020-02-02'  ),
                        (4, 'VTI4', 'Hoi ve Postman', '5', '100','3', '2020-03-03'  ),
                        (5, 'VTI5', 'Hoi ve Python' , '3', '90' ,'4', '2020-04-04'  );

INSERT INTO ExamQuestion(ExamID	, QuestionID) 
VALUES 
						(1, 2),
                        (2, 4),
                        (3, 1),
                        (4, 5),
                        (5, 3);





