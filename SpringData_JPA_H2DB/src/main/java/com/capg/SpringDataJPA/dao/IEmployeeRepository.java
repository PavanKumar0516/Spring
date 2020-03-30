package com.capg.SpringDataJPA.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.capg.SpringDataJPA.bean.Employee;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

}
