package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Service;
import java.util.List;

/**
 * @author caosufeng
 * @date 2019/10/21  - 15:22
 */

@RestController
public class Controller {

    @Autowired
    private DeptService service;

    @PostMapping("/dept/add")
    public boolean add(@RequestBody Dept dept){
        return service.add(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return service.get(id);
    }

    @GetMapping("/dept/list")
    public List<Dept> list(){
        return service.list();
    }


}
