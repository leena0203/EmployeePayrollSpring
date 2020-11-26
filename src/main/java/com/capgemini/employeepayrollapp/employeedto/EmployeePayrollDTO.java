package com.capgemini.employeepayrollapp.employeedto;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class EmployeePayrollDTO {
	@NotEmpty(message = "Name should not be null")
	public String name;
	@NotNull
	public long salary;
	@Override
	public String toString() {
		return "EmployeePayrollDTO [name=" + name + ", salary=" + salary + ", toString()=" + super.toString() + "]";
	}
}
