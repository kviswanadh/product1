package com.premier.books.controller;

import com.premier.books.model.Department;
import com.premier.books.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/services")
public class DepartmentController {


    @Autowired private DepartmentService departmentService;


    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department)
    {
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList()
    {
        return departmentService.fetchDepartmentList();
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@RequestBody Department department,
                     @PathVariable("id") Long departmentId)
    {
        System.out.println("department is updated");
        return departmentService.updateDepartment(
                department, departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id")
                                       Long departmentId)
    {
        System.out.println("department is deleted");
        departmentService.deleteDepartmentById(departmentId);
        return "Deleted Successfully";
    }
}
