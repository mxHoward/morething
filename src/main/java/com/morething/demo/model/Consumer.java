package com.morething.demo.model;

import java.util.Date;

/**
 * @Author Howard
 * @Date 2017-11-1
 */
public class Consumer {
	private int ID;

	private String phone;

	private String name;

	private String password;

	private Date birthday;

	private int gender;//0 for male and 1 for female

	private String address;

	public Consumer(int ID, String phone, String name, String password, Date birthday, int gender, String address) {
		this.ID = ID;
		this.phone = phone;
		this.name = name;
		this.password = password;
		this.birthday = birthday;
		this.gender = gender;
		this.address = address;
	}

	public Consumer() {
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

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
