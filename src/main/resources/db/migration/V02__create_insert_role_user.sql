 CREATE TABLE ROLE(
	id SERIAL not null,
	name varchar(50),
	PRIMARY KEY(id)
);

CREATE TABLE USER_TASK(
	id  SERIAL not null,
	email varchar(50),
	name varchar(50),
	password varchar(50),
	PRIMARY KEY(id)
);

CREATE TABLE USERS_ROLES(
	user_id bigint not null,
	role_id bigint not null,
	PRIMARY KEY(user_id,role_id),
	FOREIGN KEY(user_id) REFERENCES USER_TASK(id),
	FOREIGN KEY(role_id) REFERENCES ROLE(id)
);

INSERT INTO role(id,name) values(1,'ADMINISTRADOR');
INSERT INTO role(id,name) values(2,'USUARIO');


insert into user_task(email,name, password) values('email.com','jaqueline','123');


insert into users_roles(user_id,role_id) values(1,1);