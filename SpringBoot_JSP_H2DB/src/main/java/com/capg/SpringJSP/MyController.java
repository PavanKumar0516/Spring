package com.capg.SpringJSP;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/app")
public class MyController {
	@Autowired
	IEmployeeRepository emprepo;
	@RequestMapping("/add")
	
	//data is transfered from html page to this controller using @RequestParam
	public String addEmployee(@RequestParam("eid") int eid, @RequestParam("ename") String ename,
			@RequestParam("salary") double salary, HttpSession session) {
		Employee emp = new Employee();
		emp.setEid(eid);
		emp.setEname(ename);
		emp.setSalary(salary);
		
		//binding data into session object so that will be printed in jsp page
		session.setAttribute("empObj", emp);
		System.out.println(emp);
		
		//data is sending to h2 database 
		emprepo.save(emp);
		return "display";
	}
}
