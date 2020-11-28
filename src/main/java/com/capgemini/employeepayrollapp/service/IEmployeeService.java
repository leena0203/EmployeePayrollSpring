package com.capgemini.employeepayrollapp.service;
import java.util.List;

import com.capgemini.employeepayrollapp.employeedto.EmployeePayrollDTO;
import com.capgemini.employeepayrollapp.model.Employee;

public interface IEmployeeService {
	public Employee addEmployee(EmployeePayrollDTO employeeDTO);

	public Employee getEmployeeById(Long id) throws EmployeeException;
	public void updateEmployeeById(Long id, EmployeePayrollDTO employeeDTO) throws EmployeeException;
	public void deleteEmployeeById(Long id);
	public List getAllEmployees();
}