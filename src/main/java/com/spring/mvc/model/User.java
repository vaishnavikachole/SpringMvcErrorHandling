package com.spring.mvc.model;

public class User
{
	private String userName;
	private String emailId;
	private String password;
	private long id;

	public User() {
		super();
	}

	public User(String userName, String emailId, String password,long id) {
		super();
		this.userName = userName;
		this.emailId = emailId;
		this.password = password;
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", emailId=" + emailId + ", password=" + password + ",id=" + id + "]";
	}
	
	

}
