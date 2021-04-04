package com.dto;

public class User {

	String userid;
	String passwd;
	String username;
	String address;
	
	public User() {
	}
	
	public User(String userid, String passwd, String username, String address) {
		super();
		this.userid = userid;
		this.passwd = passwd;
		this.username = username;
		this.address = address;
	}
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", passwd=" + passwd + ", username=" + username + ", address=" + address
				+ "]";
	}
	
	
}
