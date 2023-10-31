package com.example.controller;

import com.example.pojo.Emp;
import com.example.pojo.PageBean;
import com.example.pojo.Result;
import com.example.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/emps")
public class EmpController {
    @Autowired
    private EmpService empService;

    /**
     * 根据条件进行分页查询
     *
     * @param page：当前的页码
     * @param pageSize：每页的大小
     * @param name：查询条件，姓名
     * @param gender：查询条件，性别
     * @return
     */
    @GetMapping
    public Result getByPageAndCondition(
            @RequestParam(defaultValue = "1") Integer page,
            @RequestParam(defaultValue = "10") Integer pageSize,
            String name,
            Short gender
    ) {
        PageBean pageBean = empService.getByPageAndCondition(page, pageSize, name, gender);
        return Result.success(pageBean);
    }

    /**
     * 新增员工
     *
     * @param emp
     * @return
     */
    @PostMapping
    public Result add(@RequestBody Emp emp) {
        empService.add(emp);
        return Result.success();
    }

    /**
     * 批量删除
     *
     * @param ids
     * @return
     */
    @DeleteMapping("/{ids}")
    public Result del(@PathVariable List<Integer> ids) {
        empService.del(ids);
        return Result.success();
    }

    /**
     * 根据id查询员工
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Emp emp = empService.getById(id);
        return Result.success(emp);
    }

    /**
     * 根据id修改员工
     *
     * @param emp
     * @return
     */
    @PutMapping
    public Result set(@RequestBody Emp emp) {
        empService.set(emp);
        return Result.success();
    }
}
