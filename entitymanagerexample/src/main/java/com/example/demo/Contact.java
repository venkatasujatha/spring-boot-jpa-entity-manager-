package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contact {
	@Id
	private int id;
	private String name;
	private String email;
	private long contactno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getContactno() {
		return contactno;
	}
	public void setContactno(long contactno) {
		this.contactno = contactno;
	}
	public Contact(int id, String name, String email, long contactno) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contactno = contactno;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", email=" + email + ", contactno=" + contactno + "]";
	}
	
	
	

}
