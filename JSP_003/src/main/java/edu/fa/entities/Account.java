package edu.fa.entities;

public class Account {
	private int id;
	private String userName;
	private String email;
	private String password;
	
	public Account() {
	}

	public Account(String userName, String email, String password) {
		this.userName = userName;
		this.email = email;
		this.password = password;
	}

	public Account(int id, String userName, String email, String password) {
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", userName=" + userName + ", email=" + email + ", password=" + password + "]";
	}
	
	
}
