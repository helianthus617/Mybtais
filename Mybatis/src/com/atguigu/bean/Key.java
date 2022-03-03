package com.atguigu.bean;

public class Key {
	private Integer id;
	private String keyName;
	private Lock lock;
	
	public Lock getLock() {
		return lock;
	}
	public void setLock(Lock lock) {
		this.lock = lock;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getKeyName() {
		return keyName;
	}
	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}
	@Override
	public String toString() {
		return "Key [id=" + id + ", keyName=" + keyName + ", lock=" + lock
				+ "]";
	}
	public Key(Integer id, String keyName) {
		super();
		this.id = id;
		this.keyName = keyName;
	}

	public Key() {
		super();
	}

	public Key(Integer id, String keyName, Lock lock) {
		super();
		this.id = id;
		this.keyName = keyName;
		this.lock = lock;
	}
}
