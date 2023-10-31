package com.example.controller;

import com.example.pojo.Dept;
import com.example.pojo.Result;
import com.example.service.DeptService;
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
@RequestMapping("/depts")
public class DeptController {
    @Autowired
    private DeptService deptService;

    /**
     * 分页查询所有部门
     *
     * @param page：当前页的页码
     * @param pageSize：每页的大小
     * @return
     */
    @GetMapping
    public Result getAllDepts(
            @RequestParam(defaultValue = "1") Integer page,
            @RequestParam(defaultValue = "10") Integer pageSize) {
        return Result.success(deptService.getAllDepts(page, pageSize));
    }

    /**
     * 根据id删除部门
     *
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public Result delById(@PathVariable Integer id) {
        deptService.delById(id);
        return Result.success();
    }

    /**
     * 新增部门
     *
     * @param dept
     * @return
     */
    @PostMapping
    public Result add(@RequestBody Dept dept) {
        deptService.add(dept);
        return Result.success();
    }

    /**
     * 根据id修改部门
     *
     * @param dept
     * @return
     */
    @PutMapping
    public Result setById(@RequestBody Dept dept) {
        deptService.setById(dept);
        return Result.success();
    }
}
