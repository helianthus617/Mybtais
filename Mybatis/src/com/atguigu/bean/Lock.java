package com.atguigu.bean;

import java.util.List;

public class Lock {
	private String lockName;
	private Integer id;
	private List<Key> keys;
	
	public List<Key> getKeys() {
		return keys;
	}
	public void setKeys(List<Key> keys) {
		this.keys = keys;
	}
	@Override
	public String toString() {
		return "Lock [lockName=" + lockName + ", id=" + id + ", keys=" + keys
				+ "]";
	}
	public String getLockName() {
		return lockName;
	}
	public void setLockName(String lockName) {
		this.lockName = lockName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Lock(String lockName, Integer id) {
		super();
		this.lockName = lockName;
		this.id = id;
	}
	public Lock() {
		super();
	}

}
