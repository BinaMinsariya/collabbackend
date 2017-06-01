package com.beena.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="FRIEND")
public class Friend {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long fid;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	private UserDetails user;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="friendId")
	private UserDetails friend;
	private String status;
	private boolean isOnline;
	public long getFid() {
		return fid;
	}
	public void setFid(long fid) {
		this.fid = fid;
	}
	public UserDetails getUser() {
		return user;
	}
	public void setUser(UserDetails user) {
		this.user = user;
	}
	public UserDetails getFriend() {
		return friend;
	}
	public void setFriend(UserDetails friend) {
		this.friend = friend;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public boolean isOnline() {
		return isOnline;
	}
	public void setOnline(boolean isOnline) {
		this.isOnline = isOnline;
	}
	
	
		

}
