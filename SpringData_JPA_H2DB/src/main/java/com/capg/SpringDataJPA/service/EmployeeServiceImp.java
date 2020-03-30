package com.capg.SpringDataJPA.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.SpringDataJPA.bean.Employee;
import com.capg.SpringDataJPA.dao.IEmployeeRepository;

@Service
public class EmployeeServiceImp implements IEmployeeService {
	@Autowired
	IEmployeeRepository repo;

	@Override
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return repo.save(emp);
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return repo.save(emp);
	}

	@Override
	public Optional<Employee> selectEmployee(int eid) {
		// TODO Auto-generated method stub
		return repo.findById(eid);
	}

	@Override
	public void deleteEmployee(int eid) {
		// TODO Auto-generated method stub
		repo.deleteById(eid);
	}

}
