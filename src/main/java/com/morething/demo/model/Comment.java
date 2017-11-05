package com.morething.demo.model;

/**
 * @Author Howard
 * @Date 2017-11-1
 */
public class Comment {
	private int ID;

	private int productID;

	private int consumerID;

	private String content;

	private int grade;

	private String response;

	public Comment(int ID, int productID, int consumerID, String content, int grade, String response) {
		this.ID = ID;
		this.productID = productID;
		this.consumerID = consumerID;
		this.content = content;
		this.grade = grade;
		this.response = response;
	}

	public Comment() {
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public int getConsumerID() {
		return consumerID;
	}

	public void setConsumerID(int consumerID) {
		this.consumerID = consumerID;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
}
