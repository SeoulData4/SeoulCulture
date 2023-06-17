create database scsquad;
use scsquad;


create table member (
    mem_idx int primary key auto_increment,
    mem_id varchar(20) not null,
    mem_pw varchar(300) not null,
    mem_name varchar(20) not null,
    mem_hp varchar(20) not null,
    mem_email varchar(100) not null,
    mem_nickname varchar(20),
    mem_gender smallint,
    mem_birth varchar(20),
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

create table culture_list(
     sn varchar(100) primary key,
     no varchar(100),
     ccma_name varchar(100),
     crltsno_nm varchar(100),
     ccba_mnm1 varchar(100),
     ccba_mnm2 varchar(100),
     ccba_ctcd_nm varchar(100),
     ccsi_name varchar(100),
     ccba_admin varchar(100),
     ccba_kdcd varchar(100),
     ccba_ctcd varchar(100),
     ccba_asno varchar(100),
     ccba_cpno varchar(100),
     longitude varchar(100),
     latitude varchar(100),
     ccba_cncl varchar(100)
);