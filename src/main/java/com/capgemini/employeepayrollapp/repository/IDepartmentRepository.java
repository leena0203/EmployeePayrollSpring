package com.capgemini.employeepayrollapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.employeepayrollapp.model.Department;

public interface IDepartmentRepository extends JpaRepository<Department, Long> {

}
