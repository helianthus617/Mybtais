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
public interface CatDao {
	
	public int updateCat(Cat teacher);

	public List<Cat> getCatByCondition(Cat cat);
	public List<Cat> getCatByCondition1(Cat cat);
	public List<Cat> getCatByCondition2(Cat cat);
	public List<Cat> getCatByIdIn(@Param("ids")List<Integer> ids);
	
}

