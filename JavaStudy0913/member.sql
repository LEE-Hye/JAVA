create table memberInfo(
	id varchar(200),
	pw varchar(200) not null,
	name varchar(200) not null,
	nick varchar(200) not null
);

select * from memberInfo;

insert into memberinfo values('admin', '1234', 'ÀÌÇýºó', '°ü¸®ÀÚ');