package com.bookStore.entity;

public class bookAdminlogin {

	private String email;
	private String password;
	
	public bookAdminlogin() {
		super();
		// TODO Auto-generated constructor stub
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
		return "bookAdminlogin [email=" + email + ", password=" + password + "]";
	}
	
}
