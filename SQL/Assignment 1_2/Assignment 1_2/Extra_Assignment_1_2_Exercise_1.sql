drop database if exists Fresher;
create database Fresher;
use Fresher;
-- create table : Trainee
create table Trainee (
TraineeID 							tinyint unsigned,
Full_Name							varchar (50),
Birth_Date							Date,
Gender								ENUM('male','female','unknown'),
ET_IQ								tinyint unsigned check(ET_IQ <=20),
ET_Gmath							tinyint unsigned check(ET_Gmath <=20),
ET_English 							tinyint unsigned check(ET_English >=50),
Training_class    					varchar (30),
Evaluastion_Notes 					Varchar(500)
);

-- chen them VTI_Account
alter table Trainee
add VTI_Account varchar(50) not null unique