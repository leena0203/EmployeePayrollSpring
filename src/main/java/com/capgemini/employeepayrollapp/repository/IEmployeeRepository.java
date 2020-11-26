package com.capgemini.employeepayrollapp.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.employeepayrollapp.model.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Long>{

}
