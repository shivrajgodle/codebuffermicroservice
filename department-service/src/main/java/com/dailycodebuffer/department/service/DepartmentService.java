package com.dailycodebuffer.department.service;

import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService  {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("inside saveDepartment of service Department");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {

        log.info("inside findDepartmentById of service Department");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
