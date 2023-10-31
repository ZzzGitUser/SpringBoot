package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
    private Integer id; //员工id
    private String username;    //用户名
    private String password;    //密码
    private String name;    //姓名
    private Short gender;   //性别，1：男；2：女
    private Short job;  //职位，1：班主任；2：讲师；3：学工主管；4：教研主管；5：咨询师
    private LocalDateTime entrydate;    //入职日期
    private Integer deptId; //所属部门id
    private LocalDateTime createTime;   //信息创建时间
    private LocalDateTime updateTime;   //信息更新时间
}
