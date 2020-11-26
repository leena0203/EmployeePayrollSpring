package com.capgemini.employeepayrollapp.controllers;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.employeepayrollapp.employeedto.*;
import com.capgemini.employeepayrollapp.model.Employee;
import com.capgemini.employeepayrollapp.service.IEmployeeService;

@RestController
@RequestMapping("/hello")
public class EmployeePayrollController {
	@Autowired
	IEmployeeService empService;
	@GetMapping("/")
	public ResponseEntity<String> getEmployeeData(){
		return new ResponseEntity<String>("Get call success",HttpStatus.OK);
	}
	@GetMapping("/get/{empId}")
	public ResponseEntity<String> getEmployeeDataById(@PathVariable("empId") int empId){
		return new ResponseEntity<String>("Get call success for id:" + empId,HttpStatus.OK);
	}
	@PostMapping("/create")
	public ResponseEntity<String> addEmployee(@Valid @RequestBody EmployeePayrollDTO employeeDTO){
		Employee emp = empService.addEmployee(employeeDTO);
		return new ResponseEntity<String>("Created new employee : "+ emp, HttpStatus.OK);
	}
	@PutMapping("/update")
	public ResponseEntity<String> updateEmployee(@RequestBody EmployeePayrollDTO employeeDTO){
		return new ResponseEntity<String>("Updated the existing employee : "+employeeDTO, HttpStatus.OK);
	}
	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<String> deleteEmployeeById(@PathVariable("empId") int empId){
		return new ResponseEntity<String>("Deleted the employee with id : "+empId, HttpStatus.OK);
	}
}


