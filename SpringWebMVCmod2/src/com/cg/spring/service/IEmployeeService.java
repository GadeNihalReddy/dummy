package com.cg.spring.service;

import java.util.List;

import com.cg.spring.dto.Employee;

public interface IEmployeeService {

	public void addEmployee(Employee e);
	public List<Employee> showEmployees();
	public void deleteEmployee(int id);
	public Employee searchEmployee(int id);
	public void updateEmployee(Employee e);
}
