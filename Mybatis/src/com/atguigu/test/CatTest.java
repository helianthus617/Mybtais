package com.atguigu.test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
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

import com.atguigu.bean.Cat;
import com.atguigu.bean.Employee;
import com.atguigu.dao.CatDao;
import com.atguigu.dao.EmployeeDao;
public class CatTest {
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
//			public Cat(Integer id, String name, Integer gender, Integer age) {
			CatDao catDao = session.getMapper(CatDao.class);
			Cat cat1=new Cat(3,"%f%",1,2);
			Cat cat2=new Cat(null,"%f%",1,2);
			Cat cat3=new Cat(3,"%f%",1,null);
			Cat cat4=new Cat(null,"%f%",1,null);
		catDao.getCatByCondition(cat1);
		catDao.getCatByCondition(cat2);
		catDao.getCatByCondition(cat3);
		catDao.getCatByCondition(cat4);

			
		List<Cat> catByCondition1 = catDao.getCatByCondition1(cat1);
		catDao.getCatByCondition1(cat2);
		catDao.getCatByCondition1(cat3);
		catDao.getCatByCondition1(cat4);

		catDao.getCatByCondition2(cat1);
		catDao.getCatByCondition2(cat2);
		catDao.getCatByCondition2(cat3);
		catDao.getCatByCondition2(cat4);	
			
	    Integer[] array =new Integer[] {5,6,7,8};
		List<Cat> catByIdIn = catDao.getCatByIdIn(Arrays.asList(array));
			

		catDao.updateCat(cat1);	
		catDao.updateCat(cat2);
		catDao.updateCat(cat3);
		catDao.updateCat(cat4);
		} finally {
			//手动提交
		session.commit();
		session.close();
		}
	}

}


































