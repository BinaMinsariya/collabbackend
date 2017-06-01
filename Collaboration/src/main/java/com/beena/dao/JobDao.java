package com.beena.dao;

import java.util.List;

import com.beena.model.Job;
import com.beena.model.JobApplication;

public interface JobDao 
{
	/* public void addJob(Job job);
	public void updateJob(Job job);
	public Job getJobById(long jobId);
	public List<Job> listJobs();
	public void saveJobApplication(JobApplication jobApplication); */
	public List<Job> list();
	public Job get(int id);

	public void add(Job job);

	public void delete(int id);

}
