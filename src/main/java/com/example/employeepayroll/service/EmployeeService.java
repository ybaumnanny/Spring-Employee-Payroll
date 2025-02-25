
package com.example.employeepayroll.service;

import com.example.employeepayroll.dto.EmployeeDTO;
import com.example.employeepayroll.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(EmployeeDTO employeeDTO);
    List<Employee> getAllEmployees();
    Employee updateEmployee(Long id, EmployeeDTO employeeDTO);
    void deleteEmployee(Long id);
}