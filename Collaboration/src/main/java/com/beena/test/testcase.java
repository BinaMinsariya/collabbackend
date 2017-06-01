package com.beena.test;

import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.beena.config.ApplicationContextConfig;
import com.beena.dao.BlogDao;
import com.beena.dao.JobApplicationDao;
import com.beena.dao.JobDao;
import com.beena.dao.UserDao;
import com.beena.model.Blog;
import com.beena.model.Job;
import com.beena.model.JobApplication;
import com.beena.model.UserDetails;

public class testcase 
{
	public static void main(String[] ar)
	{

	@SuppressWarnings({ "resource", "unused" })
	AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationContextConfig.class);
	/* UserDao userdao =(UserDao) context.getBean("userdao");
	UserDetails user= new UserDetails();
	
	user.setUname("SaiBaba2");
	user.setPassword("password123");
	user.setEmailid("rani@gmail.com");
	user.setUrole("admin");
	user.setIs_online(true);
	user.setMobileno("7890989087");
	userdao.addUser(user);	 

	
	/*  JobDao jobdao =(JobDao) context.getBean("jobdao");
	Job job= new Job();
	
	job.setTitle("Developer");
	job.setDescription("java developer role is good");
	job.setQualification("graduated");
	job.setStatus("Applicable");
	//job.setAppliedofjob(new Date());
	jobdao.addJob(job); */
	
	/*  UserDao userdao =(UserDao) context.getBean("userdao");
	JobDao jobDao = (JobDao) context.getBean("jobdao");
	JobApplicationDao jobappdao= (JobApplicationDao) context.getBean("jobappdao");
	JobApplication jobapplication = new JobApplication();
	jobapplication.setRemarks("Good");
	
	jobapplication.setStatus("applicable");
	jobapplication.setUsers(userdao.getUser(1));
	jobapplication.setJob(jobDao.getJob(48));
	jobappdao.addJobApp(jobapplication);   */ 
	/* UserDao userdao =(UserDao) context.getBean("userdao");
	 BlogDao blogdao =(BlogDao) context.getBean("blogDAO");
		Blog blog= new Blog();	
		blog.setBtitle("java");
		blog.setBdesc("nfjgmtkyyh,thl");
		blog.setBstatus("1");
		blog.setUsers(userdao.getUser(1)); */
	}
	
}
	
