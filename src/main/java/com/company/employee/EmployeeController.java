package com.company.employee;

import java.util.List;

public class EmployeeController {

    private final EmployeeService employeeService = new EmployeeService();

    public void createEmployee(Employee employee) {
        employeeService.addEmployee(employee);
		System.out.println("Employee created successfully");

    }

    public List<Employee> getEmployees() {
        return employeeService.getAllEmployees();
    }
}
