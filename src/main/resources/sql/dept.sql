create table dept
(
    id          int unsigned auto_increment comment '主键ID'
        primary key,
    name        varchar(10) not null comment '部门名称',
    create_time datetime    not null comment '创建时间',
    update_time datetime    not null comment '修改时间',
    constraint name
        unique (name)
)
    comment '部门表';

INSERT INTO db01_my.dept (id, name, create_time, update_time) VALUES (1, '学工部', '2023-09-14 14:50:04', '2023-09-14 14:50:04');
INSERT INTO db01_my.dept (id, name, create_time, update_time) VALUES (2, '教研部', '2023-09-14 14:50:04', '2023-09-14 14:50:04');
INSERT INTO db01_my.dept (id, name, create_time, update_time) VALUES (3, '咨询部', '2023-09-14 14:50:04', '2023-09-14 14:50:04');
INSERT INTO db01_my.dept (id, name, create_time, update_time) VALUES (4, '就业部', '2023-09-14 14:50:04', '2023-09-14 14:50:04');
INSERT INTO db01_my.dept (id, name, create_time, update_time) VALUES (7, '人事部222', '2023-09-15 14:19:48', '2023-09-15 14:20:43');
