package com.capgemini.employeepayrollapp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.employeepayrollapp.model.Employee;
@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Long>{

}
