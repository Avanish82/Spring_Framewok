package com.controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.controller.Employee;
import com.controller.EmpDao;

@Repository
public class EmpDaoImpl implements EmpDao
{
	private JdbcTemplate tempate;
	
	 public void setTempate(JdbcTemplate tempate) {
		this.tempate = tempate;
	}
	 public JdbcTemplate getTempate() {
		return tempate;
	}
	 public Employee mapRow(ResultSet rs, int rowNum) throws SQLException 
     {
         Employee employee = new Employee();
         employee.setId(rs.getInt(1));
         employee.setName(rs.getString(2));
         employee.setEmail(rs.getString(3));
         employee.setAge(rs.getInt(4));
         employee.setAddress(rs.getString(5));
         return employee;
     }
 });
 return employee;
}
	 //Saving a new Employee
	 public void saveEmployee(Employee employee)
	 {
		 String sql="insert into Employee values(?,?,?,?,?)";
		 System.out.println("dao called");
		 template.update(sql, new Object[] {employee.getId(), employee.getName(), employee.getEmail(), employee.getAge(), employee.getAddress()});
		 
	 }

}
