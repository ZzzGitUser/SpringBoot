package com.example.service;

import com.example.pojo.Emp;
import com.example.pojo.PageBean;

import java.util.List;

public interface EmpService {
    /**
     * 根据条件进行分页查询
     *
     * @param page：当前的页码
     * @param pageSize：每页的大小
     * @param name：查询条件，姓名
     * @param gender：查询条件，性别
     * @return
     */
    PageBean getByPageAndCondition(Integer page, Integer pageSize, String name, Short gender);

    /**
     * 新增员工
     *
     * @param emp
     */
    void add(Emp emp);

    /**
     * 批量删除
     *
     * @param ids
     */
    void del(List<Integer> ids);

    /**
     * 根据id查询员工
     *
     * @param id
     * @return
     */
    Emp getById(Integer id);

    /**
     * 根据id修改员工
     *
     * @param emp
     */
    void set(Emp emp);

    /**
     * 登录
     *
     * @param emp
     * @return
     */
    Emp login(Emp emp);
}
