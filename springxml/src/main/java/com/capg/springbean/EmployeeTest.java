package com.capg.springbean;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Resource res =new ClassPathResource("application.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		Employee employee=(Employee) factory.getBean("emp");
		//Address a1= factory.getBean(Address.class);
		Address addr=employee.getAddress();
		//employee.setEid(101);
		System.out.println(employee);
		

	}

}
