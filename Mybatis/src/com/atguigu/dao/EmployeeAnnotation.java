package com.atguigu.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.atguigu.bean.Employee;

public interface EmployeeAnnotation {
		

	@Select("select * from t_employee where id=#{id}")	
	public Employee getEmpById(Integer id); 
	@Update("UPDATE t_employee SET empname=#{empName}, 	gender=#{gender}, 	email=#{email}	where id=#{id}")
	public int updateEmployee(Employee employee);
	@Delete("DELETE FROM t_employee  where id=#{id}")
	public boolean deleteEmployee(Integer id);
	@Insert("INSERT INTO t_employee(empname,gender,email)values(#{empName},#{gender},#{email})")
	public int insertEmployee(Employee employee);
		
		
}
