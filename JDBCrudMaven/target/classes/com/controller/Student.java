package com.controller;

public class Student 
{
	private int id;
	private String name;
	private String clss;
	private String email;
	private int phone;
	private String address;
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setClss(String clss) {
		this.clss = clss;
	}
	public String getClss() {
		return clss;
	}
    public void setEmail(String email) {
		this.email = email;
	}
    public String getEmail() {
		return email;
	}
    public void setPhone(int phone) {
		this.phone = phone;
	}
    public int getPhone() {
		return phone;
	}
    public void setAddress(String address) {
		this.address = address;
	}
    public String getAddress() {
		return address;
	}
}
