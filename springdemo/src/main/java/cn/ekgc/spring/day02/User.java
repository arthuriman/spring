package cn.ekgc.spring.day02;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private String username;
	private String cellphone;
	private Integer age;
	
	public User() {}
	public User(String username, String cellphone) {
		this.username = username;
		this.cellphone = cellphone;
	}
	public User(String username, Integer age) {
		this.username = username;
		this.age = age;
	}
	
	public void show() {
		System.out.println("username = " + username);
		System.out.println("cellphone = " + cellphone);
		System.out.println("age = " + age);
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
}
