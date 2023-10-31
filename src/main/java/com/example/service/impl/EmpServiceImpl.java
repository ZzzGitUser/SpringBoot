package com.example.service.impl;

import com.example.mapper.EmpMapper;
import com.example.pojo.Emp;
import com.example.pojo.PageBean;
import com.example.service.EmpService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    /**
     * 根据条件进行分页查询
     *
     * @param page：当前的页码
     * @param pageSize：每页的大小
     * @param name：查询条件，姓名
     * @param gender：查询条件，性别
     * @return
     */
    @Override
    public PageBean getByPageAndCondition(Integer page, Integer pageSize, String name, Short gender) {
        //设置分页参数
        PageHelper.startPage(page, pageSize);
        List<Emp> empList = empMapper.selectByPageAndCondition(name, gender);
        Page<Emp> p = (Page<Emp>) empList;
        PageBean pageBean = new PageBean(p.getTotal(), p.getResult());
        return pageBean;
    }

    /**
     * 新增员工
     *
     * @param emp
     */
    @Override
    public void add(Emp emp) {
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        empMapper.insert(emp);
    }

    /**
     * 批量删除
     *
     * @param ids
     */
    @Override
    public void del(List<Integer> ids) {
        empMapper.del(ids);
    }

    /**
     * 根据id查询员工
     *
     * @param id
     * @return
     */
    @Override
    public Emp getById(Integer id) {
        return empMapper.selectById(id);
    }

    /**
     * 根据id修改员工
     *
     * @param emp
     */
    @Override
    public void set(Emp emp) {
        emp.setUpdateTime(LocalDateTime.now());
        empMapper.update(emp);
    }

    /**
     * 登录
     *
     * @param emp
     * @return
     */
    @Override
    public Emp login(Emp emp) {
        return empMapper.getByUsernameAndPassword(emp);
    }
}
