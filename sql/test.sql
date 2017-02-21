--班级表
create table grade
(
	gid int primary key,
	gname varchar(20) not null,
	gdesc varchar(50)
);

--学生表
create table student
(
	sid int primary key,
	sname varchar(20) not null,
	sex char(2),
	gid int
);

-- --创建外键
alter table student add constraint fk_student_id foreign key (gid) references grade(gid);

-- --使用这段sql后别忘了将  create  改为   update