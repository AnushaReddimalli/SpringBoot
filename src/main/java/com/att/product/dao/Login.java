package com.att.product.dao;

public class Login {

	private String attId;
	private String password;
	
	public Login()
	{
		
	}
	public Login(String attId, String password) {
		this.attId = attId;
		this.password = password;
	}
	public String getAttId() {
		return attId;
	}
	public void setAttId(String attId) {
		this.attId = attId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
