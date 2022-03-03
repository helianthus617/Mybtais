package com.atguigu.bean;

public class Cat {
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Cat [id=" + id + ", name=" + name + ", gender=" + gender
				+ ", age=" + age + "]";
	}
	public Cat(Integer id, String name, Integer gender, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public Cat() {
		super();
	}
	private Integer id;
	private String name;
	private Integer gender;
	private Integer age;
	
}
