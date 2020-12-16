package com.capgemini.employeepayrollapp.employeedto;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
public @Data class EmployeePayrollDTO {
	@Size(max =10,min =3, message = "Names should be between 3-10 characters")
	public String name;
	@Min(value = 10, message = "Salary should be greater than 10")
	public long salary;
	public String department;
	public String image;
	public String gender;
	
}
