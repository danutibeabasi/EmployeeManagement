package com.ecommerceshopping.cart.service.Impl;

import com.ecommerceshopping.cart.exception.ResourceNotFoundException;
import com.ecommerceshopping.cart.model.Employee;
import com.ecommerceshopping.cart.repository.EmployeeRespository;
import com.ecommerceshopping.cart.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRespository employeeRespository;
    public EmployeeServiceImpl(EmployeeRespository employeeRespository) {
        super();
        this.employeeRespository = employeeRespository;
    }


    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRespository.save(employee);
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeRespository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
//        Optional  <Employee> employee = employeeRespository.findById(id);
//        if (employee.isPresent()) {
//            return employee.get();
//        }
//        else {
//            throw new ResourceNotFoundException("Employee", "Id", id);
//
//        }
        return employeeRespository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee", "Id", id));
    }

    @Override
    public Employee updateEmployee(Employee employee, long id) {
        Employee existingEmployee = employeeRespository.findById(employee.getId()).orElseThrow(() -> new ResourceNotFoundException("Employee", "Id", employee.getId()));
        existingEmployee.setFirstName(employee.getFirstName());
        existingEmployee.setLastName(employee.getLastName());
        return employeeRespository.save(existingEmployee);
    }

    @Override
    public void deleteEmployee(long id) {
        employeeRespository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee", "Id", id));
        employeeRespository.deleteById(id);
    }
}
