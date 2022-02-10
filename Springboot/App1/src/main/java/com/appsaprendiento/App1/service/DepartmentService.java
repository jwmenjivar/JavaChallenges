package com.appsaprendiento.App1.service;

import com.appsaprendiento.App1.entity.Department;

import java.util.List;

public interface DepartmentService {
    
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId);

    public void deleteDepartmentById(Long departmentId);
}
