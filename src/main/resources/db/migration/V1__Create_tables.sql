use `match`;
create table user (
id bigint primary key auto_increment,
name varchar (1000)
) DEFAULT CHARSET=utf8mb4;

create table `match` (
id bigint primary key auto_increment,
user_id bigint,
score int
)DEFAULT CHARSET=utf8mb4;
