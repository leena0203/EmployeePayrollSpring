package com.capgemini.employeepayrollapp.controllers;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
import com.capgemini.employeepayrollapp.service.EmployeeException;
import com.capgemini.employeepayrollapp.service.IEmployeeService;

import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/employee")
public class EmployeePayrollController {
	@Autowired
	IEmployeeService empService;
	@ApiOperation(value ="this is used for demo thing")
	@GetMapping("/")
	public ResponseEntity<String> getEmployeeData(){
		return new ResponseEntity<String>("Get call success",HttpStatus.OK);
	}
	@ApiOperation(value = "This api is used to fetch details by empId", notes  = "Enter empId in long form", response = Employee.class)
	@GetMapping("/get/{empId}")
	public ResponseEntity<ResponseDTO> getEmployeeDataById(@PathVariable("empId") Long empId) throws EmployeeException{
		Employee emp = empService.getEmployeeById(empId);
		return new ResponseEntity<ResponseDTO>(new ResponseDTO("Got Employee with given id",emp),HttpStatus.OK);
	}
	/**
	 * This API is creating new entry in database
	 * @param employeeDTO
	 * @return
	 */
	@ApiOperation(value ="This api is used to create")
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addEmployee(@Valid @RequestBody EmployeePayrollDTO employeeDTO){
		Employee emp = empService.addEmployee(employeeDTO);
		return new ResponseEntity<ResponseDTO>(new ResponseDTO("Added a new employee",emp), HttpStatus.OK);
	}
	/**
	 * This API is for updating in existing API
	 * @param empId
	 * @param employeeDTO
	 * @return
	 * @throws EmployeeException
	 */
	@ApiOperation(value = "This api is for updating existing entry")
	@PutMapping("/update/{empId}")
	public ResponseEntity<ResponseDTO> updateEmployee(@PathVariable("empId") Long empId, @RequestBody @Valid EmployeePayrollDTO employeeDTO) throws EmployeeException{
		empService.updateEmployeeById(empId, employeeDTO);
		return new ResponseEntity<ResponseDTO>(new ResponseDTO("Updated data successfully",empId), HttpStatus.OK);
	}
	/**
	 * This API is for deleting entries from database
	 * @param empId
	 * @return
	 */
	@ApiOperation(value = "Delete any entry")
	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<ResponseDTO> deleteEmployeeById(@PathVariable("empId") Long empId){
		empService.deleteEmployeeById(empId);
		return new ResponseEntity<ResponseDTO>(new ResponseDTO("Deleted the employee sucessfully",empId), HttpStatus.OK);
	}
	/**
	 * Get all employees from database
	 * @return
	 */
	@ApiOperation(value = "get all entries")
	@GetMapping("/getall")
	public ResponseEntity<List<Employee>> getAllEmployees(){
		List employeesList = empService.getAllEmployees();
		return new ResponseEntity<>(employeesList, HttpStatus.OK);
	}
}


