package com.capgemini.employeepayrollapp.service;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.employeepayrollapp.employeedto.EmployeePayrollDTO;
import com.capgemini.employeepayrollapp.model.Employee;
import com.capgemini.employeepayrollapp.repository.IEmployeeRepository;

@Service
public class EmployeeServiceIMPL implements IEmployeeService{
	@Autowired
	IEmployeeRepository employeeRepository;
	@Autowired
	private ModelMapper mapper;
	@Override
	public Employee addEmployee(EmployeePayrollDTO employeeDTO) {
		//Employee emp =new Employee(employeeDTO);
		System.out.println(employeeDTO);
		try{
			Employee emp = mapper.map(employeeDTO, Employee.class);
		//	emp.getDepartment().addAll(emp.getDepartment());
			System.out.println(emp.getDepartment());
			emp = employeeRepository.save(emp);
			return emp;
		}
		catch(Exception e){
			System.out.println("e" +e);
		}
		return null;
	}
	@Override
	public Employee getEmployeeById(Long id) throws EmployeeException {
		return employeeRepository.findById(id).orElseThrow(()->new EmployeeException("Invalid User id"));
	}
	@Override
	public void updateEmployeeById(Long id, EmployeePayrollDTO employeeDTO) throws EmployeeException {
		Employee emp = getEmployeeById(id);
		if(employeeDTO.name != null) {
			emp.setName(employeeDTO.name);
		}
		if(employeeDTO.salary != 0.0) {
			emp.setSalary(employeeDTO.salary);
		}
		employeeRepository.save(emp);
	}
	@Override
	@Transactional
	public void deleteEmployeeById(Long id) {
		System.out.println(id);
		employeeRepository.deleteById(id);
	}
	@Override
	public List getAllEmployees() {
		return employeeRepository.findAll();
	}

}
