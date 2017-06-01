package com.beena.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="Job")
public class Job 
{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int jobid;
	@Size(min=5,message="minimum 5 characters")
	private String title;
	private String description;
	private Date dateofjob;
	private String qualification;
	private String status;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getJobid() {
		return jobid;
	}
	public void setJobid(int jobid) {
		this.jobid = jobid;
	}
	public Date getDateofjob() {
		return dateofjob;
	}
	public void setDateofjob(Date dateofjob) {
		this.dateofjob = dateofjob;
	}
	
	

}