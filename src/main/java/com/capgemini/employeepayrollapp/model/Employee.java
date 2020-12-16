package com.capgemini.employeepayrollapp.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.capgemini.employeepayrollapp.employeedto.EmployeePayrollDTO;

import lombok.Data;
@Entity
@Table(name = "employee_payroll")
public @Data class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private long salary;
	private String department;
	private String gender;
	private String image;
	public Employee() {}
	public Employee(EmployeePayrollDTO employeeDTO) {
		this.name = employeeDTO.name;
		this.salary = employeeDTO.salary;
		this.department = employeeDTO.department;
		this.gender = employeeDTO.gender;
		this.image = employeeDTO.image;
	}
	
}

