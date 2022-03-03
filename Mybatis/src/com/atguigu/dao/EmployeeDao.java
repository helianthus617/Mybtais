package com.atguigu.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.atguigu.bean.Employee;

public interface EmployeeDao {
	public Employee getEmpById(Integer id);
	public Employee getEmpByIdAndEmpName(Integer id,String empName);
	public Employee getEmpByIdAndEmpNameAnnotation(@Param("id")Integer id,@Param("empName")String empName);
	public Employee getEmpByMap(Map<String,Object> map);
	//查询单条记录 列名是key,值作为value
	public Map<String,Object> getEmpByIdReturnMap(Integer id);
	@MapKey("id")
	public Map<Integer,Employee> getAllEmpsReturnMap();
	public List<Employee> getAllEmps();
	
	
	public int updateEmployee(Employee employee);
	public boolean deleteEmployee(Integer id);

	
	public int insertEmployee(Employee employee);
	public int insertEmployee1(Employee employee);
	public int insertEmployee2(Employee employee);
}

