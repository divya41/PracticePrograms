package com.example.demo.dao;

import java.util.List;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.example.demo.mapper.EmpRowMapper;
import com.example.demo.model.EmployeeModel;
@Repository
public class Empdao {
	@Autowired
	JdbcTemplate template;
	public List<EmployeeModel> getEmployees() {
		// TODO Auto-generated method stub
		String sql="select * from EMPLOYEE";
	List<EmployeeModel>	 empList= template.query(sql,new EmpRowMapper());
	return empList;
	
		
		
	}
	public EmployeeModel getById(int id) {
		// TODO Auto-generated method stub
		String sql="select * from EMPLOYEE where ID="+id;
		
		return template.queryForObject(sql, new EmpRowMapper());
	}

}
