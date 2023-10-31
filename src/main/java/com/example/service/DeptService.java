package com.example.service;

import com.example.pojo.Dept;
import com.example.pojo.PageBean;

import java.util.List;

public interface DeptService {
    /**
     * 分页查询所有部门
     *
     * @param page：当前页的页码
     * @param pageSize：每页的大小
     * @return
     */
    PageBean getAllDepts(Integer page, Integer pageSize);

    /**
     * 根据id删除部门
     *
     * @param id
     */
    void delById(Integer id);

    /**
     * 新增部门
     *
     * @param dept
     */
    void add(Dept dept);

    /**
     * 根据id修改部门
     *
     * @param dept
     */
    void setById(Dept dept);
}
