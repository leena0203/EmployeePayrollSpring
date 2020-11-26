package com.capgemini.employeepayrollapp.service;
import com.capgemini.employeepayrollapp.employeedto.EmployeePayrollDTO;
import com.capgemini.employeepayrollapp.model.Employee;

public interface IEmployeeService {
	public Employee addEmployee(EmployeePayrollDTO employeeDTO);
}