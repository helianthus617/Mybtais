package com.atguigu.test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.atguigu.bean.Employee;
import com.atguigu.dao.EmployeeDao;
public class EmployeeTest {
/*
 * SqlSessionFactory是 SqlSession的工厂,负责创建SqlSession对象
 * SqlSession对象代表了和数据库的一次会话
 * */
	@Test
	public void anytest() throws Exception {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory =
				new SqlSessionFactoryBuilder().build(inputStream);
		//openSession(false)=手动提交
		SqlSession session = sqlSessionFactory.openSession(false);
		try {
		  EmployeeDao mapper = session.getMapper(EmployeeDao.class);
		 
		  mapper.insertEmployee(new Employee(null,"小敏","xx@qq.com",1));
		  mapper.insertEmployee(new Employee(null,"小华","xx@qq.com",2));
		  mapper.insertEmployee(new Employee(null,"小芳","xx@qq.com",1));
		  mapper.insertEmployee(new Employee(null,"小派","xx@qq.com",2));
		  mapper.insertEmployee(new Employee(null,"小可","xx@qq.com",1));

		  	  
		  List<Employee> allEmps = mapper.getAllEmps();
		  System.out.println("allEmps"+allEmps);
		  Employee empById = mapper.getEmpById(14);
		  System.out.println("empById"+empById);
		  Employee empByIdAndEmpName = mapper.getEmpByIdAndEmpName(23,"小可");
		  System.out.println("empByIdAndEmpName"+empByIdAndEmpName);
		  Employee empByIdAndEmpNameAnnotation = mapper.getEmpByIdAndEmpNameAnnotation(17,"小派");
		  System.out.println("empByIdAndEmpNameAnnotation"+empByIdAndEmpNameAnnotation);
		  
		  Map<String,Object> maps=new HashMap<String,Object>();
	  	  maps.put("id", 21);
		  maps.put("empName","小芳");
		  Employee empByMap = mapper.getEmpByMap(maps);
		  System.out.println("empByMap"+empByMap);
  
		 		  
		//	查询单条记录 列名是key,值作为value
		  Map<String, Object> empByIdReturnMap = mapper.getEmpByIdReturnMap(17);
		  System.out.println("empByIdReturnMap"+empByIdReturnMap);

		  Map<Integer, Employee> allEmpsReturnMap = mapper.getAllEmpsReturnMap();
		  System.out.println("allEmpsReturnMap"+allEmpsReturnMap);
		  Employee emp1=	new Employee(18,"小唐","xx@qq.com",1);
		  int updateEmployee = mapper.updateEmployee(emp1);
		  System.out.println("updateEmployee"+updateEmployee);
		  boolean deleteEmployee = mapper.deleteEmployee(14);
		  System.out.println(deleteEmployee);
		  
	
		  Employee employee1 = new Employee(null,"222","xx@qq.com",1);
		  mapper.insertEmployee1(employee1 );
		  Integer id = employee1.getId();
		  Employee employee2 = new Employee(null,"333","xx@qq.com",1);
		  mapper.insertEmployee1(employee2 );
		  Integer id2 = employee2.getId();
		  System.out.println(id+"    "+id2);
	
		} finally {
			//手动提交
		session.commit();
		session.close();
		}
	}

}


































