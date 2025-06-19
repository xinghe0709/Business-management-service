create table profiles
(
    id             BIGINT not null
        primary key,
    bio            TEXT,
    phone_number   varchar(255) null,
    date_of_brith  date         null,
    loyalty_points int          UNSIGNED default 0,
    constraint profiles_users_id_fk
        foreign key (id) references users(id)
);
