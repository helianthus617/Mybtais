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

import com.atguigu.bean.Cat;
import com.atguigu.bean.Employee;
import com.atguigu.bean.Key;
import com.atguigu.bean.Lock;
import com.atguigu.dao.CatDao;
import com.atguigu.dao.EmployeeDao;
import com.atguigu.dao.KeyDao;
import com.atguigu.dao.LockDao;
public class LockAndKeyTest {
/*
 * SqlSessionFactory是 SqlSession的工厂,负责创建SqlSession对象
 * SqlSession对象代表了和数据库的一次会话
 * */
	@Test
	public void anytest2() throws Exception {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory =
				new SqlSessionFactoryBuilder().build(inputStream);
		//openSession(false)=手动提交
		SqlSession session = sqlSessionFactory.openSession(false);
		try {
			KeyDao keyDao = session.getMapper(KeyDao.class);
						
			Key k1 = keyDao.getKeyById(1);
			Key k2 = keyDao.getKeyBySteps(1);
			System.out.println("k1--->"+k1);
			System.out.println("k2--->"+k2);
		LockDao lockDao = session.getMapper(LockDao.class);
		Lock l1 = lockDao.getLockById(3);
		Lock l2 = lockDao.getLockByIdByStep(3);
		Lock l3 = lockDao.getLockById(1);
		Lock l4 = lockDao.getLockByIdByStep(1);
		
		System.out.println("l1-------->"+l1);
		System.out.println("l2-------->"+l2);
		System.out.println("l3-------->"+l3);
		System.out.println("l4-------->"+l4);

		} finally {
			//手动提交
		session.commit();
		session.close();
		}
	}

}


































