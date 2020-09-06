drop database if exists Data_types_2;
create database Data_types_2;
use Data_types_2;
-- tao bang thongtin
create table Data_types_2(
ID						INT unsigned primary key,
`Name`					varchar (30) check(Name >=6),
Birth_Date				Date,
gender					BIT,
 -- 0 la Male, 1 la Female, Null la unknown
IsdeletedFlag			enum('0','1')
);
