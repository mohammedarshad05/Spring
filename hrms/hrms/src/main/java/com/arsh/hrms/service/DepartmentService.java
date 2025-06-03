package com.arsh.hrms.service;

import com.arsh.hrms.model.Department;
import com.arsh.hrms.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class DepartmentService {
    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }



    public Department addDepartment(Department department) {
    return departmentRepository.save(department);
    }

}
