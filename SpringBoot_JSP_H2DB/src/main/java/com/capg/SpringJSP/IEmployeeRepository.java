package com.capg.SpringJSP;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

}
