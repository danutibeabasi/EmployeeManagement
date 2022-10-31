package com.ecommerceshopping.cart.service;

import com.ecommerceshopping.cart.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getEmployees();
    Employee getEmployeeById(Long id);

    Employee updateEmployee(Employee employee, long id);
    void deleteEmployee(long id);

}
