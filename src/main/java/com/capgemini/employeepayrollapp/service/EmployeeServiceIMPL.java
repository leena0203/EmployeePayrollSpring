package com.capgemini.employeepayrollapp.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.employeepayrollapp.employeedto.EmployeePayrollDTO;
import com.capgemini.employeepayrollapp.model.Employee;
import com.capgemini.employeepayrollapp.repository.IEmployeeRepository;
@Service
public class EmployeeServiceIMPL implements IEmployeeService{
	@Autowired
	IEmployeeRepository employeeRepository;
	@Override
	public Employee addEmployee(EmployeePayrollDTO employeeDTO) {
		Employee emp = new Employee(employeeDTO);
		emp = employeeRepository.save(emp);
		return emp;
	}

}
