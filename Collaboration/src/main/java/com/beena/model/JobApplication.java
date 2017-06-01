package com.beena.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="JobApplication")
public class JobApplication 
{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int jobappid;
	
	@ManyToOne
	@JoinColumn(name="id")
	private UserDetails users;
	@ManyToOne
	@JoinColumn(name="jobid")
	private Job job;
	private Date dateApplied;
	private String remarks;
	private String status;
	
	public int getJobappid() {
		return jobappid;
	}
	public void setJobappid(int jobappid) {
		this.jobappid = jobappid;
	}
	
	public UserDetails getUsers() {
		return users;
	}
	public void setUsers(UserDetails users) {
		this.users = users;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	public Date getDateApplied() {
		return dateApplied;
	}
	public void setDateApplied(Date dateApplied) {
		this.dateApplied = dateApplied;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
						
}
