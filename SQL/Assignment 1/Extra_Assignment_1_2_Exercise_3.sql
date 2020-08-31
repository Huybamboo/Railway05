drop database if exists Data_types_2;
create database Data_types_2;
use Data_types_2;
-- tao bang thongtin
create table Data_types_2(
ID						INT unsigned primary key,
`Name`					varchar (30),
Birth_Date				Date,
gender					enum('0 is male','1 is female','NULL is unknown'),
IsdeletedFlag			enum('0','1')
);
