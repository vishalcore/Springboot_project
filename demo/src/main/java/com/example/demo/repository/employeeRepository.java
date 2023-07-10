package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Employee;

public interface employeeRepository extends JpaRepository<Employee, Long> {
    //all core database methods

}
