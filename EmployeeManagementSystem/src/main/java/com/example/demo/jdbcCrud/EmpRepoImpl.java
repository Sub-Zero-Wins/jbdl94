package com.example.demo.jdbcCrud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

class EmployeeRowMapper implements RowMapper<Employee>
{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		emp.setEmpid(rs.getInt(1));
		emp.setName(rs.getString(2));
		emp.setAge(rs.getInt(3));
		emp.setSalary(rs.getInt(4));
		return emp;
	}
}

@Repository
public class EmpRepoImpl implements EmployeeRepo
{

	@Autowired
	JdbcTemplate template;

	@Override
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO employee (empid,name, age, salary) VALUES (? ,?, ?, ?)";
		// Spring converts this into a PreparedStatement automatically

		int numOfRecUpdated =  template.update(sql,emp.getEmpid() ,emp.getName(), emp.getAge(), emp.getSalary());
		if(numOfRecUpdated>0)
			return emp;
		else
			return null;
	}

	@Override
	public Employee getEmployee(int empid) {
		 String sql = "SELECT * FROM employee WHERE empid = ?";
		 try {
			   return template.queryForObject(sql,new EmployeeRowMapper(),empid);
				 
		} catch (Exception e) {
			e.printStackTrace();
		}  
		     return null;  
		
	}

	@Override
	public Employee updateEmployee(Employee updatedEmp) {

		// Spring converts this into a PreparedStatement automatically

		String sql = "UPDATE employee SET salary = ? WHERE empid = ?";

		int numOfRecUpdated= template.update(sql, new PreparedStatementSetter() {
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, updatedEmp.getSalary());
				ps.setInt(2, updatedEmp.getEmpid());
			}
		});
			if(numOfRecUpdated>0)
				return updatedEmp;
			else
				return null;
		}

		@Override
		public Employee deleteEmployee(int empId) {
			String sql = "Delete from employee  WHERE empid = ?";

			int numOfRecUpdated= template.update(sql, new PreparedStatementSetter() {
				public void setValues(PreparedStatement ps) throws SQLException {
					ps.setInt(1, empId);
				}
			});
			if(numOfRecUpdated>0)
				return null;
			else
				return null;
			
		}

		@Override
		public List<Employee> getAllEmployees() {

			return  template.query("Select * from employee",new BeanPropertyRowMapper(Employee.class));
		}




	}
