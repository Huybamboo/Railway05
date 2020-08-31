drop database if exists Fresher;
create database Fresher;
use Fresher;
-- create table : Trainee
create table Trainee (
TraineeID 							tinyint unsigned,
Full_Name							varchar (50),
Birth_Date							Date,
Gender								ENUM('male','female','unknown'),
ET_IQ								tinyint unsigned,
ET_Gmath							tinyint unsigned,
ET_English 							tinyint unsigned,
Training_class    					varchar (30),
Evaluastion_Notes 					Varchar(50),
VTI_Acount 							Varchar(50)  not null unique key
);
