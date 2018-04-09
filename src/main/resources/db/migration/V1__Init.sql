-- user

create table user_entity (
  id int primary key,
  name varchar(255)
);


insert into user_entity(id, name) values(1, '${spring.datasource.username}');

create sequence user_entity_id_seq start with 2;
