package com.beena.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="USERBLOGS")
public class Blog 
{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long bid;
	private String btitle;
	private String bdesc;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	private UserDetails user;
	private String bstatus;
	public long getBid() {
		return bid;
	}
	public void setBid(long bid) {
		this.bid = bid;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBdesc() {
		return bdesc;
	}
	public void setBdesc(String bdesc) {
		this.bdesc = bdesc;
	}
	public UserDetails getUser() {
		return user;
	}
	public void setUser(UserDetails user) {
		this.user = user;
	}
	public String getBstatus() {
		return bstatus;
	}
	public void setBstatus(String bstatus) {
		this.bstatus = bstatus;
	}
		
	
}