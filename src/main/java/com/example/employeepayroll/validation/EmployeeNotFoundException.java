package com.example.employeepayroll.validation;

public class EmployeeNotFoundException extends RuntimeException {
    private String errorCode;

    public EmployeeNotFoundException(String message) {
        super(message);
        this.errorCode = "EMPLOYEE_NOT_FOUND"; // Set default error code
    }

    public EmployeeNotFoundException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
