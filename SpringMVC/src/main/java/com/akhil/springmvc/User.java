package com.akhil.springmvc;

public class User {
	
	private String userName;
	private String userPassword;
	private String userText;

	

	@Override
	public String toString() {
		return "User [userName=" + userName + ", userPassword=" + userPassword + ", userText=" + userText + "]";
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserText() {
		return userText;
	}

	public void setUserText(String userText) {
		this.userText = userText;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
