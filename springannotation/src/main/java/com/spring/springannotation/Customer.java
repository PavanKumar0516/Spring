package com.spring.springannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {
private int cid;
private String cname;
@Autowired
private Address address;
@Autowired
public Service service;
/*@Autowired
private MyDAO dao;*/
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
@Override
public String toString() {
	return "Customer [cid=" + cid + ", cname=" + cname + ", address=" + address + "]";
}


}
