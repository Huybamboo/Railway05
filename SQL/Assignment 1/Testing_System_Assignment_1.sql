DROP DATABASE IF EXISTS Testing_System;
CREATE DATABASE Testing_System;
USE Testing_System;

CREATE TABLE Department (
    DepartmentID 			TINYINT UNSIGNED,
    DepartmentName			VARCHAR(30)
);
CREATE TABLE Position (
    PositionID 				TINYINT UNSIGNED,
    PositionName 			VARCHAR(30)
);
CREATE TABLE `Account` (
    AccountID				TINYINT UNSIGNED,
    Email 					VARCHAR(30),
    Username				VARCHAR(30),
    Fullname 				VARCHAR(30),
    DepartmentID 			TINYINT UNSIGNED,
    PositionID 				VARCHAR(30),
    CreateDate				DATE
);
CREATE TABLE `Group` (
    GroupID 				TINYINT UNSIGNED,
    GroupName 				VARCHAR(30),
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
    TypeName 				VARCHAR(30)
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
