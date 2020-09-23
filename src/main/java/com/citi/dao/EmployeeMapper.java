/**
 * 
 */
package com.citi.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.citi.bean.Employee;

/**
 * @author Rucha
 *
 */
public class EmployeeMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		  Employee employee = new Employee();
		  employee.setName(rs.getString("name"));
		  employee.setAge(rs.getInt("age"));
	      return employee;
		
	}
}
