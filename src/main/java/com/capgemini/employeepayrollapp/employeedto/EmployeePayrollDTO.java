package com.capgemini.employeepayrollapp.employeedto;
import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import com.capgemini.employeepayrollapp.model.Department;

import lombok.AllArgsConstructor;
import lombok.Data;

public @Data class EmployeePayrollDTO {
	@Size(max =10,min =3, message = "Names should be between 3-10 characters")
	public String name;
	@Min(value = 10, message = "Salary should be greater than 10")
	public long salary;
	public List<DepartmentDTO> department;
	public String profile;
	public String gender;
	public String startDate;
public String notes;
}
