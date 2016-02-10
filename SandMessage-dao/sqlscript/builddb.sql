--Construction of the DB
DROP schema sandmessage CASCADE;
DROP SEQUENCE seq_person IF EXISTS;
DROP SEQUENCE seq_message IF EXISTS;
CREATE schema sandmessage AUTHORIZATION DBA;
create table sandmessage.person 
(
	id  integer not null PRIMARY KEY,
	first_name varchar(64) not null,
	last_name varchar(64) not null,
	nickname varchar(16) not null,
	email varchar(256) not null,
	password varchar(128) not null,
	active boolean default false not null
);

create table sandmessage.message
(
	id integer not null primary key,
	text varchar(2048) not null,
	entered_time timestamp(3) not null,
	hidden_time timestamp(3) not null,
	fk_person integer not null,
	foreign key (fk_person) REFERENCES sandmessage.person (id)
);

--sequences
create sequence seq_person as integer start with 1 increment by 1;
create sequence seq_message as integer start with 1 increment by 1;


insert into sandmessage.person(id,first_name,last_name,nickname,email,password) 
values (NEXT VALUE FOR seq_person,'Gérald','Maréchal','gerald1973','gerald1973@gmail.com','password');



