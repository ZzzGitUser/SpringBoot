package com.example.service.impl;

import com.example.mapper.DeptMapper;
import com.example.pojo.Dept;
import com.example.pojo.PageBean;
import com.example.service.DeptService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    /**
     * 分页条件查询
     *
     * @param page：当前页的页码
     * @param pageSize：每页的大小
     * @return
     */
    @Override
    public PageBean getAllDepts(Integer page, Integer pageSize) {
        PageHelper.startPage(page, pageSize);
        List<Dept> deptList = deptMapper.selectAllDepts();
        Page<Dept> p = (Page<Dept>) deptList;
        return new PageBean(p.getTotal(), p.getResult());
    }

    /**
     * 根据id删除部门
     *
     * @param id
     */
    @Override
    public void delById(Integer id) {
        deptMapper.delById(id);
    }

    /**
     * 新增部门
     *
     * @param dept
     */
    @Override
    public void add(Dept dept) {
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());
        deptMapper.insert(dept);
    }

    /**
     * 根据id修改部门
     *
     * @param dept
     */
    @Override
    public void setById(Dept dept) {
        dept.setUpdateTime(LocalDateTime.now());
        deptMapper.updateById(dept);
    }
}
