package com.example.mapper;

import com.example.pojo.Dept;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface DeptMapper {
    /**
     * 查询所有部门
     *
     * @return
     */
    @Select("SELECT id, name, create_time, update_time FROM dept")
    List<Dept> selectAllDepts();

    /**
     * 根据id删除部门
     *
     * @param id
     */
    @Delete("DELETE FROM dept WHERE id=#{id}")
    void delById(Integer id);

    /**
     * 新增部门
     *
     * @param dept
     */
    @Insert("INSERT INTO dept(name, create_time, update_time) VALUES (#{name},#{createTime},#{updateTime})")
    void insert(Dept dept);

    /**
     * 根据id修改部门
     *
     * @param dept
     */
    @Update("UPDATE dept SET name=#{name},update_time=#{updateTime} WHERE id=#{id}")
    void updateById(Dept dept);
}
