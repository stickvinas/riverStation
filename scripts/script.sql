create table adminlogs
(
    id       integer      not null
        primary key,
    password varchar(255) not null,
    username varchar(255) not null
);
create table logs
(
    id       integer      not null
        primary key,
    password varchar(255) not null,
    username varchar(255) not null
);

insert into adminLogs values(1, '123', 'admin');
insert into logs values(1, '123', 'user');
