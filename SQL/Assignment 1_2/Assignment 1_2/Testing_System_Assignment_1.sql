DROP DATABASE IF EXISTS Testing_System;
CREATE DATABASE Testing_System;
USE Testing_System;

CREATE TABLE Department (
    DepartmentID 			TINYINT UNSIGNED primary key,
    DepartmentName			VARCHAR(30) check (length(departmentName)>=6)
);
CREATE TABLE Position (
    PositionID 				TINYINT UNSIGNED primary key,
    PositionName 			VARCHAR(30)  check (length(positionName)>=6)
);
CREATE TABLE `Account` (
    AccountID				TINYINT UNSIGNED primary key,
    Email 					VARCHAR(30),
    Username				VARCHAR(30) check( length(Username) >=7),
    Fullname 				VARCHAR(30)check(length(Fullname) >=7),
    DepartmentID 			TINYINT UNSIGNED,
    PositionID 				smallint unsigned,
    CreateDate				DATE,
foreign key (DepartmentID) references Department(DepartmentID)
);
CREATE TABLE `Group` (
    GroupID 				TINYINT UNSIGNED primary key,
    GroupName 				VARCHAR(30) check (length(GroupName)>=6),
    CreatorID 				TINYINT UNSIGNED,
    CreateDate 				DATE
);
CREATE TABLE GroupAccount (
    GroupID 				TINYINT UNSIGNED,
    AccountID 				TINYINT UNSIGNED,
    JoinDate 				DATE
);
CREATE TABLE TypeQuestion (
    TypeID 					TINYINT UNSIGNED,
    TypeName 				VARCHAR(30) check (length(TypeName)>=6)
);
CREATE TABLE CategoryQuestion (
    CategoryID 				TINYINT UNSIGNED,
    CategoryName 			VARCHAR(30)
);
CREATE TABLE Question (
    QuestionID 				TINYINT UNSIGNED,
    Content 				VARCHAR(30),
    CategoryID 				TINYINT UNSIGNED,
    TypeID 					TINYINT UNSIGNED,
    CreatorID 				TINYINT UNSIGNED,
    CreateDate 				DATE
);
CREATE TABLE Answer (
    AnswerID 				TINYINT UNSIGNED,
    QuestionID				TINYINT UNSIGNED,
    Content 				VARCHAR(50),
    isCorrect 				ENUM('correct','uncorrect')
);
CREATE TABLE Exam (
    ExamID 					TINYINT UNSIGNED,
    `code` 					TINYINT UNSIGNED,
    Title 					VARCHAR(30),
    CategoryID 				TINYINT UNSIGNED,
    Duration 				TIME,
    CreatorID 				TINYINT UNSIGNED,
    CreateDate				DATE
);
CREATE TABLE ExamQuestion (
    ExamID 					TINYINT UNSIGNED,
    QuestionID 				TINYINT UNSIGNED
);
