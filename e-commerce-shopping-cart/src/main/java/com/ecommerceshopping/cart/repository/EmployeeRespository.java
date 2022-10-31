package com.ecommerceshopping.cart.repository;

import com.ecommerceshopping.cart.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRespository extends JpaRepository<Employee, Long> {

}

