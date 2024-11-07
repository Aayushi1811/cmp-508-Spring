package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Employee;

public class EmpDaoImpl implements EmpDao{

	
		JdbcTemplate jdbcTemplate;

		public JdbcTemplate getJdbcTemplate() {
			return jdbcTemplate;
		}

		public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
			this.jdbcTemplate = jdbcTemplate;
		}

		public int insert(Employee employee) {
			// TODO Auto-generated method stub
			String q="insert into emp_data(eid,ename,dname)values(?,?,?)";
			
			int r=this.jdbcTemplate.update(q,employee.getEid(),employee.getEname(),employee.getDname());
			return r;
			
			
		}
		public int update(Employee employee) {
			// TODO Auto-generated method stub
			String u="update Employee set ename=? where eid=?";
			
			int r=this.jdbcTemplate.update(u,employee.getEname(),employee.getEid());
			return r;
		}
		public int delete(Employee employee) {
			// TODO Auto-generated method stub
			String u="delete Employee where eid=?";
			
			int r=this.jdbcTemplate.update(u,employee.getEid());
			return r;
		}

		public Employee getEmployee(int Eid) {
			// TODO Auto-generated method stub
		String ca="select *from emp_data where eid=?";
		RowMapper<Employee> rm=new RowMapperImpl();
		Employee employee= this.jdbcTemplate.queryForObject(ca,rm,Eid);
		return employee;
		}

		public List<Employee> getAllEmp() {
			// TODO Auto-generated method stub
		String a= "select *from Employee";
		List<Employee> employees=this.jdbcTemplate.query(a,new RowMapperImpl());
		return employees;
		}
}
		


