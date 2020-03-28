package com.spring.springannotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{

	
    public static void main( String[] args )
    {
    	
       AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(CustomConfig.class);
       Customer customer=context.getBean("getCustomer", Customer.class );
       customer.setCid(101);
       customer.setCname("javeed");
       System.out.println(customer);
       System.out.println(customer.getAddress());
       System.out.println(customer.service);
       Address addr1=(Address)context.getBean(Address.class);
       System.out.println(addr1);
       System.out.println(addr1.dao+"   dao");
       //System.out.println(ser+"pavan");
       //Service service2=(Service) context.getBean("serref",Service.class);
       //System.out.println(service2);
    }
}
