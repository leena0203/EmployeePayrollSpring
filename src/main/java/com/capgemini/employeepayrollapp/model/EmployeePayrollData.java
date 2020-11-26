package com.capgemini.employeepayrollapp.model;


import com.capgemini.employeepayrollapp.employeedto.EmployeePayrollDTO;

public class EmployeePayrollData {
	
	private Long id;
	private String name;
	private long salary;
	 public EmployeePayrollData() {}
	public EmployeePayrollData(Long id, String name, long salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
}
	 
		