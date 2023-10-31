# SpringBoot

# 1. 项目简介
本项目基于Spring Boot框架开发了一个简单的企业管理系统的后台部分，用以实现部门管理、员工管理、用户登录和登录校验的功能。

# 2. 项目技术
- JDK 11.0.19
- Maven 3.9.2
- Spring Boot 2.7.15
- MySQL 8.0.31
- MyBatis
- pagehelper
- fastjson
- jwt

# 3. 功能介绍
项目采用MVC三层架构，将代码分割在Controller、Service、Mapper当中。后端给前端返回统一的响应结果，响应结果封装在Result类当中。

        @Data
        @NoArgsConstructor
        @AllArgsConstructor
        public class Result{
            private Integer code;   //响应码，1：成功；0：失败
            private String msg; //响应信息
            private Object data;    //返回给前端的数据
        }

系统的部门管理、员工管理包括增删改查4项功能。

员工管理的查询功能还实现了分页查询和条件查询。分页查询使用了pagehelper插件来实现分页。条件查询使用了MyBatis的动态SQL来实现。

部门管理、员工管理的增删改功能，根据具体情况，也使用了MyBatis的动态SQL。

项目使用JWT令牌来标识用户，作为用户是否登录的凭证。因此，前端的请求需要携带一个键为“token”的请求头，值为登录成功时后端返回的JWT令牌。登录校验功能在拦截器Interceptor当中实现，其中的代码会解析JWT令牌。

项目还实现了一个简单的全局异常处理器。出现异常时，异常信息会封装在Result对象中，返回给前端。
