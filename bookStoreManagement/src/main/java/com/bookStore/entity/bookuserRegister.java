package com.bookStore.entity;

public class bookuserRegister {

	private String useremail;
	private String pass;
	private String rep_pass;
	
	
	public bookuserRegister() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getRep_pass() {
		return rep_pass;
	}
	public void setRep_pass(String rep_pass) {
		this.rep_pass = rep_pass;
	}
	@Override
	public String toString() {
		return "bookuserRegister [useremail=" + useremail + ", pass=" + pass + ", rep_pass=" + rep_pass + "]";
	}
	
	
	
}
