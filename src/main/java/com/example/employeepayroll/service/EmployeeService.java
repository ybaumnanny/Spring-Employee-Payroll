package com.example.employeepayroll.service;

import com.example.employeepayroll.dto.EmployeeDTO;
import com.example.employeepayroll.model.Employee;
import com.example.employeepayroll.repository.EmployeeRepository;
import com.example.employeepayroll.validation.EmployeeNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found with ID: " + id));
    }

    public Employee saveEmployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee(employeeDTO.getName(), employeeDTO.getSalary());
        return repository.save(employee);
    }

    public Employee updateEmployee(Long id, EmployeeDTO employeeDTO) {
        Employee existingEmployee = repository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found with ID: " + id));

        existingEmployee.setName(employeeDTO.getName());
        existingEmployee.setSalary(employeeDTO.getSalary());
        return repository.save(existingEmployee);
    }

    public void deleteEmployee(Long id) {
        if (!repository.existsById(id)) {
            throw new EmployeeNotFoundException("Employee not found with ID: " + id);
        }
        repository.deleteById(id);
    }
}
