/*============================== CREATE DATABASE =======================================*/

DROP DATABASE IF EXISTS Final_Java;
CREATE DATABASE Final_Java;
USE Final_Java;

/*============================== CREATE TABLE =======================================*/
CREATE TABLE Project(
projectId		INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
nameproject 	VARCHAR(50) NOT NULL UNIQUE KEY,
teamSize		INT UNSIGNED NOT NULL,
idManager		INT UNSIGNED NOT NULL,
idEmployees		INT UNSIGNED NOT NULL
);

CREATE TABLE `User` (
IDUser			INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
FullName		NVARCHAR(100) UNIQUE KEY NOT NULL,
Email			NVARCHAR(200) UNIQUE KEY NOT NULL,
`Password`		NVARCHAR(15) NOT NULL CHECK(length(`Password`) >= 6),
Roles			ENUM('EMPLOYEE' , 'MANAGER')
);

CREATE TABLE Manager (
IDUser 			INT UNSIGNED,
FullName	 	NVARCHAR(100) NOT NULL,
ExpInYear 		INT UNSIGNED NOT NULL,
FOREIGN KEY (IDUser) REFERENCES `User` (IDUser) ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY (FullName) REFERENCES `User` (FullName) ON DELETE CASCADE ON UPDATE CASCADE
);

DROP TABLE IF EXISTS Employee;
CREATE TABLE Employee (
IDUser 			INT UNSIGNED,
FullName		NVARCHAR(100) NOT NULL,
projectId		INT UNSIGNED NOT NULL,
ProSkill		ENUM( 'DEV' , 'TEST', 'JAVA', 'SQL'),
FOREIGN KEY (IDUser) REFERENCES `User` (IDUser) ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY (FullName) REFERENCES `User` (FullName) ON DELETE CASCADE ON UPDATE CASCADE
);




/*============================== INSERT INTO =======================================*/
INSERT INTO Project ( projectId	,nameproject  , teamSize	, idManager	, idEmployees	)
VALUES 				(1			,N'Dự án số 1', 2			, 1			,2				),
					(2			,N'Dự án số 2', 1			, 1			,1				),
                    (3			,N'Dự án số 3', 2			, 1			,1				);
                    

INSERT INTO `User`  (IDUser	, 		FullName, 				Email,				 `Password`			, Roles		) 
VALUES
					(1		,			N'Nguyễn Thị Mỵ',	'mynt2407@gmail.com'	, 'mynguyen123'		, 'EMPLOYEE'),
					(2		,			N'Nguyễn Ngọc Duy',	'duynn03@gmail.com'		, 'duynguyenngoc'	, 'MANAGER'	),
                    (3		,			N'Nguyễn Hùng Mạnh','hungmanh@gmail.com'	, 'hungmanh123'		, 'EMPLOYEE'),
                    (4		,			N'Tống Thị Nhung',	'nhung@gmail.com'		, 'nhungtong'		, 'EMPLOYEE'),
                    (5		,			N'Trần Thị Kim Anh','kimoanh.tran@gmail.com', 'tran.kimoanh'	, 'EMPLOYEE');



INSERT INTO Employee( IDUser, FullName				, projectId	, ProSkill)
VALUES 				( 1		, N'Nguyễn Thị Mỵ'		, 1			, 'DEV'	),
					( 3		, N'Nguyễn Hùng Mạnh'	, 3			, 'SQL'	),
                    ( 4		, N'Tống Thị Nhung'		, 3			, 'TEST'),
                    ( 5		, N'Trần Thị Kim Anh'	, 2			, 'TEST');
                    
INSERT INTO  Manager(IDUser	, FullName				, ExpInYear	)
VALUES 				(2		, N'Nguyễn Ngọc Duy'	, 2			);
