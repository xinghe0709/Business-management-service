create table tags
(
    id   int auto_increment
        primary key,
    name varchar(255) not null
);

create table user_tags
(
    user_id bigint not null,
    tag_id  int    not null,
    constraint user_tags_pk
        primary key (user_id, tag_id),
    constraint user_tags___fk
        foreign key (tag_id) references tags (id) ON DELETE CASCADE ,
    constraint user_tags_users_id_fk
        foreign key (user_id) references users (id) ON DELETE CASCADE
);




