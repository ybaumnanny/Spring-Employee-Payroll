
package com.example.employeepayroll.dto;
public class EmployeeDTO {

    private String name;

    private double salary;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String name, double salary) {

        this.name = name;

        this.salary = salary;
    }

// Getters and Setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}