package com.company.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    private final List<Employee> employees = new ArrayList<>();

   public void addEmployee(Employee employee) {
    if (employee.getName() == null || employee.getName().isEmpty()) {
        throw new IllegalArgumentException("Employee name cannot be empty");
    }
    employees.add(employee);
}


    public List<Employee> getAllEmployees() {
        return employees;
    }
}
