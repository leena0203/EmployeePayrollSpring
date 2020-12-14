package com.capgemini.employeepayrollapp.employeedto;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
public @Data class EmployeePayrollDTO {
	@Size(max =10,min =3, message = "Names should be between 3-10 characters")
	public String name;
	@Min(value = 2, message = "Salary should be greater than 1 digit")
	@Max(10)
	public long salary;
	
}
