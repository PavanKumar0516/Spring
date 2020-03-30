package com.capg.SpringDataJPA.service;

import java.util.Optional;

import com.capg.SpringDataJPA.bean.Employee;

public interface IEmployeeService {
	
	public Employee addEmployee(Employee emp);
	public Employee updateEmployee(Employee emp);
	public Optional<Employee> selectEmployee(int eid);
	public void deleteEmployee(int eid);
}
