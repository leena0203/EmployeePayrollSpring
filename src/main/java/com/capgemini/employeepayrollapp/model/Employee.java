package com.capgemini.employeepayrollapp.model;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
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
	private String gender;
	private String profile;
	private String startDate;
	private String notes;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Department> department = new ArrayList<>();
	public Employee() {}
	
	
	
}

