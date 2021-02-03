package com.vicky.mvcannotation.models;


import org.springframework.stereotype.Component;
//states that instance of this class
//will be created,maintained and injected 
//by spring container
@Component
public class Demomodels {
	private int id;
	private String Name;
	private String Addr;
	private String Email;
	
	public Demomodels() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Demomodels(int id, String name, String addr, String email) {
		super();
		this.id = id;
		Name = name;
		Addr = addr;
		Email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddr() {
		return Addr;
	}
	public void setAddr(String addr) {
		Addr = addr;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	@Override
	public String toString() {
		return "Demomodels [id=" + id + ", Name=" + Name + ", Addr=" + Addr + ", Email=" + Email + "]";
	}
	

}
