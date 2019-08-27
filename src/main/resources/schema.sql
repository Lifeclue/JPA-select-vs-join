CREATE TABLE article (
    id BIGINT(20) NOT NULL AUTO_INCREMENT,
    title varchar(255) not null default '',
    description varchar(2000) not null default '',
    created_at timestamp not null default current_timestamp,
    updated_at timestamp not null default current_timestamp,
    primary key(id)
);

create table notice (
    id BIGINT(20) not null auto_increment,
    article_id bigint(20) not null,
    pinned_position int(3) not null default '0',
    created_at timestamp not null default current_timestamp,
    updated_at timestamp not null default current_timestamp,
    expired_at timestamp not null default current_timestamp,
    primary key (id)
);
