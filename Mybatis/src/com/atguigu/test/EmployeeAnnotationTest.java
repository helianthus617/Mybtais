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
import com.atguigu.dao.EmployeeAnnotation;
import com.atguigu.dao.EmployeeDao;
public class EmployeeAnnotationTest {
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
		  EmployeeAnnotation mapper = session.getMapper(EmployeeAnnotation.class);
		  
		  mapper.insertEmployee(new Employee(null,"小噢","xx@qq.com",1));
		  mapper.getEmpById(29);
		  mapper.updateEmployee(new Employee(47,"小噢","xx@qq.com",1));
		  mapper.deleteEmployee(46);
	
		} finally {
			//手动提交
		session.commit();
		session.close();
		}
	}

}


































