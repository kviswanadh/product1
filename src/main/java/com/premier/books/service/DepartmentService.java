package com.premier.books.service;


import com.premier.books.model.Department;
import com.premier.books.model.Employee;

import java.util.List;
import java.util.Map;

public interface DepartmentService {

    // Save operation
    Department saveDepartment(Department department);

    // Read operation
    List<Department> fetchDepartmentList();

    List<Employee> fetchEmployeeList();

    // Update operation
    Department updateDepartment(Department department,
                                Long departmentId);

    // Delete operation
    void deleteDepartmentById(Long departmentId);
}
