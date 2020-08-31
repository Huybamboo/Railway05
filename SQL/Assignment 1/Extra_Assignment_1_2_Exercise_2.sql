drop database if exists Data_types;
create database Data_types;
use Data_types;
-- tao bang thongtin
create table thongtin(
ID						INT unsigned primary key,
`Name`					varchar (30),
`Code`					varchar(5),
ModifieldDate			Datetime
);