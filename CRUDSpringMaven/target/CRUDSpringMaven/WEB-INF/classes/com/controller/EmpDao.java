package com.controller;

import java.util.List;

import com.javainterviewpoint.Employee;

public interface EmpDao 
{
	 public void saveEmployee(Employee employee);
	    public Employee getEmployeeById(int id);
	    public void updateEmployee(Employee employee);

}
