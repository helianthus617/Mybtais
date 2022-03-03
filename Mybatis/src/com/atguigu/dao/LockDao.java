package com.atguigu.dao;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.atguigu.bean.Cat;
import com.atguigu.bean.Employee;
import com.atguigu.bean.Key;
import com.atguigu.bean.Lock;
public interface LockDao {
	
	public Lock getLockById(Integer id);
	public Lock getLockByIdByStep(Integer id);
	
	public Lock getLockByIdSimple(Integer id);
	
				


}

