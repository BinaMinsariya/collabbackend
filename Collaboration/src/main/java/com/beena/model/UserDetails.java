package com.beena.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="UserDetails")
@Entity
public class UserDetails 
{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private String uname;
	private String password;
	private String emailid;
	private Boolean is_online;
	private String urole;
	private String mobileno;
	
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public Boolean getIs_online() {
		return is_online;
	}
	public void setIs_online(Boolean is_online) {
		this.is_online = is_online;
	}
	public String getUrole() {
		return urole;
	}
	public void setUrole(String urole) {
		this.urole = urole;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	};
	
	
	
	
	
	
}
