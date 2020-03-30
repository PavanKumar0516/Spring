package com.capg.SpringDataJPA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.SpringDataJPA.bean.Employee;
import com.capg.SpringDataJPA.service.IEmployeeService;
@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired 
	IEmployeeService service;
	
	@PostMapping("/add")
	public String addEmployee( @RequestBody Employee emp ) {
		service.addEmployee(emp);
		return "Employee added sucessfully";
	}
	@PutMapping("/update")
	public String updateEmployee(@RequestBody Employee emp) {
		service.updateEmployee(emp);
		return "Employee updated sucessfully";
	}
	@GetMapping("/select/{eid}")
	public String selectEmployee(@PathVariable ("eid") int eid) {
		String data=service.selectEmployee(eid).toString();
		return data;
	}
	@DeleteMapping("/delete/{eid}")
	public String deleteEmployee(@PathVariable ("eid") int eid) {
		service.deleteEmployee(eid);
		return "Employee deleted sucessfully";
	}
}


