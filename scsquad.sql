create database scsquad;
use scsquad;


create table mem(
	pr_idx int auto_increment primary key,
    pr_name varchar(20) not null,
    pr_userid varchar(20) not null,
    pr_userpw varchar(100) not null,
    pr_hp varchar(100) not null,
    pr_hometel varchar(100),
    pr_jobtel varchar(100),
    pr_birth varchar(100) not null,
    pr_region varchar(100) not null,
    pr_email varchar(100) not null,
    reg_date datetime default now(),
    update_date datetime
);

create table review_member (
	idx int auto_increment primary key,
    -- s_member smallint default 0,
    member_idx int not null,
    is_event smallint default 0,
    target_idx varchar(50) not null,
    content varchar(1000) not null,
    reg_date datetime default now(),
    update_date datetime,
    foreign key(member_idx) references mem(pr_idx) on update cascade on delete cascade
);

create table review_none(
	idx int auto_increment primary key,
    -- is_member smallint default 1,
    temp_id varchar(20) not null,
    temp_pw varchar(100) not null,
    is_event smallint not null default 0,
    target_idx varchar(50) not null,
    content varchar(1000),
    reg_date datetime default now(),
    update_date datetime
);

create table lk(
	idx int auto_increment primary key,
    user_idx varchar(20) not null,
    is_member smallint not null,
    review_idx int not null,
    reg_date datetime default now()
);

create table images(
	idx int auto_increment primary key,
    img_path varchar(1000) not null,
    is_member smallint not null,
    review_idx int not null
);