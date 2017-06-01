package com.beena.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.beena.model.Job;
import com.beena.model.JobApplication;

@SuppressWarnings({ "unused" })
@Transactional
@Repository("jobappdao")
public class JobApplicationDaoImpl implements JobApplicationDao
{
SessionFactory sessionFactory;

	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
	    this.sessionFactory = sessionFactory;
	}



	public boolean addJobApp(JobApplication jobapp) {
		try {
			System.out.println("entered in add jobapp dao");

			sessionFactory.getCurrentSession().persist(jobapp);

			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

}
