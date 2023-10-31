package com.example.mapper;

import com.example.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpMapper {
    /**
     * 根据条件进行分页查询
     *
     * @param name：查询条件，姓名
     * @param gender：查询条件，性别
     * @return
     */
    List<Emp> selectByPageAndCondition(String name, Short gender);

    /**
     * 新增员工
     *
     * @param emp
     */
    void insert(Emp emp);

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
    Emp selectById(Integer id);

    /**
     * 根据id修改员工
     *
     * @param emp
     */
    void update(Emp emp);

    Emp getByUsernameAndPassword(Emp emp);
}
