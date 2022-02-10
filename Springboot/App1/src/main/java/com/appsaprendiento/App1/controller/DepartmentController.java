package com.appsaprendiento.App1.controller;

import com.appsaprendiento.App1.entity.Department;
import com.appsaprendiento.App1.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

}
