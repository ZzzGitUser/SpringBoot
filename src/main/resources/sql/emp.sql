create table emp
(
    id          int unsigned auto_increment comment 'ID'
        primary key,
    username    varchar(20)            not null comment '用户名',
    password    varchar(32) default '' null comment '密码',
    name        varchar(10)            not null comment '姓名',
    gender      tinyint unsigned       not null comment '性别, 说明: 1 男, 2 女',
    job         tinyint unsigned       null comment '职位, 说明: 1 班主任,2 讲师, 3 学工主管, 4 教研主管, 5 咨询师',
    entrydate   date                   null comment '入职时间',
    dept_id     int unsigned           null comment '部门ID',
    create_time datetime               not null comment '创建时间',
    update_time datetime               not null comment '修改时间',
    constraint username
        unique (username)
)
    comment '员工表';

INSERT INTO db01_my.emp (id, username, password, name, gender, job, entrydate, dept_id, create_time, update_time) VALUES (1, 'LiuYi', '123456', '刘一', 1, 4, '2000-01-01', 2, '2023-09-14 14:54:44', '2023-09-14 14:54:44');
INSERT INTO db01_my.emp (id, username, password, name, gender, job, entrydate, dept_id, create_time, update_time) VALUES (2, 'ChenEr', '123456', '陈二', 1, 2, '2015-01-01', 2, '2023-09-14 14:54:44', '2023-09-14 14:54:44');
INSERT INTO db01_my.emp (id, username, password, name, gender, job, entrydate, dept_id, create_time, update_time) VALUES (3, 'ZhangSan', '123456', '张三', 1, 2, '2008-05-01', 2, '2023-09-14 14:54:44', '2023-09-14 14:54:44');
INSERT INTO db01_my.emp (id, username, password, name, gender, job, entrydate, dept_id, create_time, update_time) VALUES (4, 'LiSi', '123456', '李四', 1, 2, '2007-01-01', 2, '2023-09-14 14:54:44', '2023-09-14 14:54:44');
INSERT INTO db01_my.emp (id, username, password, name, gender, job, entrydate, dept_id, create_time, update_time) VALUES (5, 'WangWu', '123456', '王五', 1, 2, '2012-12-05', 2, '2023-09-14 14:54:44', '2023-09-14 14:54:44');
INSERT INTO db01_my.emp (id, username, password, name, gender, job, entrydate, dept_id, create_time, update_time) VALUES (6, 'ZhaoLiu', '123456', '赵六', 2, 3, '2013-09-05', 1, '2023-09-14 14:54:44', '2023-09-14 14:54:44');
INSERT INTO db01_my.emp (id, username, password, name, gender, job, entrydate, dept_id, create_time, update_time) VALUES (7, 'SunQi', '123456', '孙七', 2, 1, '2005-08-01', 1, '2023-09-14 14:54:44', '2023-09-14 14:54:44');
INSERT INTO db01_my.emp (id, username, password, name, gender, job, entrydate, dept_id, create_time, update_time) VALUES (8, 'ZhouBa', '123456', '周八', 2, 1, '2014-11-09', 1, '2023-09-14 14:54:44', '2023-09-14 14:54:44');
INSERT INTO db01_my.emp (id, username, password, name, gender, job, entrydate, dept_id, create_time, update_time) VALUES (9, 'WuJiu', '123456', '吴九', 2, 1, '2011-03-11', 1, '2023-09-14 14:54:44', '2023-09-14 14:54:44');
INSERT INTO db01_my.emp (id, username, password, name, gender, job, entrydate, dept_id, create_time, update_time) VALUES (10, 'ZhengShi', '123456', '郑十', 2, 1, '2013-09-05', 1, '2023-09-14 14:54:44', '2023-09-14 14:54:44');
INSERT INTO db01_my.emp (id, username, password, name, gender, job, entrydate, dept_id, create_time, update_time) VALUES (11, 'LiuShiYi', '123456', '刘十一', 1, 5, '2007-02-01', 3, '2023-09-14 14:54:44', '2023-09-14 14:54:44');
INSERT INTO db01_my.emp (id, username, password, name, gender, job, entrydate, dept_id, create_time, update_time) VALUES (12, 'ChenShiEr', '123456', '陈十二', 1, 5, '2008-08-18', 3, '2023-09-14 14:54:44', '2023-09-14 14:54:44');
INSERT INTO db01_my.emp (id, username, password, name, gender, job, entrydate, dept_id, create_time, update_time) VALUES (13, 'ZhangShiSan', '123456', '张十三', 1, 5, '2012-11-01', 3, '2023-09-14 14:54:44', '2023-09-14 14:54:44');
INSERT INTO db01_my.emp (id, username, password, name, gender, job, entrydate, dept_id, create_time, update_time) VALUES (14, 'LiShiSi', '123456', '李十四', 1, 2, '2002-08-01', 2, '2023-09-14 14:54:44', '2023-09-14 14:54:44');
INSERT INTO db01_my.emp (id, username, password, name, gender, job, entrydate, dept_id, create_time, update_time) VALUES (15, 'WangShiWu', '123456', '王十五', 1, 2, '2011-05-01', 2, '2023-09-14 14:54:44', '2023-09-14 14:54:44');
INSERT INTO db01_my.emp (id, username, password, name, gender, job, entrydate, dept_id, create_time, update_time) VALUES (16, 'ZhaoShiLiu', '123456', '赵十六', 1, 2, '2007-01-01', 2, '2023-09-14 14:54:44', '2023-09-14 14:54:44');
INSERT INTO db01_my.emp (id, username, password, name, gender, job, entrydate, dept_id, create_time, update_time) VALUES (17, 'SunShiQi', '123456', '孙十七', 1, 4, '2015-03-21', 3, '2023-09-14 14:54:44', '2023-09-14 14:54:44');
