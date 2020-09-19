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
    ProjectCompletedOn					DATE,
    FOREIGN KEY(ProjectID) REFERENCES Project_Modules(ProjectID)						 -- sai ----------------------
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
	WorkDonrID							SMALLINT AUTO_INCREMENT PRIMARY KEY,
    EmployeeID							SMALLINT,
    ModuleID							SMALLINT,
	WorkDoneDate						DATE,
    WorkDoneDescription					VARCHAR(1000),
    WorkDoneStatus 						ENUM('YES', 'NO'),
    FOREIGN KEY (EmployeeID) REFERENCES Employee(EmployeeID),
    FOREIGN KEY (ModuleID) REFERENCES Project_Modules(ModuleID)
    );



    
