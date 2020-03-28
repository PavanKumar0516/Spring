package com.capg.springbean;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
private int eid;
private String ename;
private int salary;
private Address address;
private List<String> skills;
private Map<Integer, String> map;
private Set<Integer> set;

public Set<Integer> getSet() {
	return set;
}
public void setSet(Set<Integer> set) {
	this.set = set;
}
public List<String> getSkills() {
	return skills;
}
public void setSkills(List<String> skills) {
	this.skills = skills;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Employee() {
	super();
}
public Employee(int eid, String ename, int salary) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.salary = salary;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}


@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", address=" + address + ", skills="
			+ skills + ", map=" + map + ", set=" + set + "]";
}
public Map<Integer, String> getMap() {
	return map;
}
public void setMap(Map<Integer, String> map) {
	this.map = map;
}


}
