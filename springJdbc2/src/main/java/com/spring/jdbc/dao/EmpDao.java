package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entities.Employee;

public interface EmpDao {
	public int insert(Employee employee);
	public int update(Employee employee);
	public int delete (Employee employee);
	
	public Employee getEmployee(int Eid);
	public List<Employee> getAllEmp();
	
	
}
