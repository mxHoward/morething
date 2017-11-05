package com.morething.demo.model;


/**
 * @Author Howard
 * @Date 2017-11-1
 */
public class Store {
	private int ID;

	private String phone;

	private String name;

	private String password;

	public Store(int ID, String phone, String name, String password) {
		this.ID = ID;
		this.phone = phone;
		this.name = name;
		this.password = password;
	}

	public Store(){
	}


	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
