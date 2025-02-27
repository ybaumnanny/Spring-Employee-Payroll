
package com.example.employeepayroll.controller;
import com.example.employeepayroll.dto.EmployeeDTO;
import com.example.employeepayroll.model.Employee;
import com.example.employeepayroll.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
   /* private final EmployeeService service;

    @Autowired
    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping
    public List<EmployeeDTO> getAllEmployeesDTO() {
        return service.getAllEmployeesDTO();
    }

    @GetMapping("/{id}")
    public EmployeeDTO getEmployeeDTOById(@PathVariable Long id) {
        return service.getEmployeeDTOById(id);
    }

    @PostMapping
    public EmployeeDTO addEmployeeDTO(@RequestBody EmployeeDTO employeeDTO) {
        return service.addEmployeeDTO(employeeDTO);
    }

    @PutMapping("/{id}")
    public EmployeeDTO updateEmployeeDTO(@PathVariable Long id, @RequestBody EmployeeDTO employeeDTO) {
        return service.updateEmployeeDTO(id, employeeDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployeeDTO(@PathVariable Long id) {
        service.deleteEmployeeDTO(id);
    }*/

    @Autowired
    private EmployeeService service;

    @GetMapping
    public List<Employee> getAllEmployees() { return service.getAllEmployees(); }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) { return service.getEmployeeById(id); }


    @PostMapping
    public Employee createEmployee(@Valid @RequestBody EmployeeDTO employeeDTO) {
        return service.saveEmployee(employeeDTO);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @Valid @RequestBody EmployeeDTO employeeDTO) {
        return service.updateEmployee(id, employeeDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) { service.deleteEmployee(id); }
}