package com.beena.dao;

import java.util.List;

import javax.persistence.NoResultException;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.beena.model.UserDetails;


@SuppressWarnings({ "unused", "deprecation" })
@Transactional
@Repository("userdao")
public class UserDaoImpl implements UserDao
{
	
	@Autowired
	SessionFactory sessionFactory;

	public void addUser(UserDetails user) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(user);
		
	}

	 public void updateUser(UserDetails user) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(user);
		
	}

	 public void deleteUser(UserDetails user) {
		Session session=sessionFactory.getCurrentSession();
		session.delete(user);
		
	} 

	public List<UserDetails> listUsers() {
		Session session=sessionFactory.getCurrentSession();
		List<UserDetails> users=session.createQuery("from UserDetails").getResultList();
		
		return users;
	}

	public UserDetails getUserByUserId(long userId) {
		
		Session session=sessionFactory.getCurrentSession();
		UserDetails user=(UserDetails)session.createQuery("from UserDetails where id="+userId).getSingleResult();
		
		return user;
	} 

	

	public boolean isExistingUser(UserDetails user) {
		UserDetails u=null;
		try {
		u=getUserByUserName(user.getUname());
		}catch(NoResultException nre){
			
		}
		if(u!=null)
		{
			return true;
		}
		else
			return false;
}

	@Override
	public UserDetails getUserByUserName(String username) {
		Session session=sessionFactory.getCurrentSession();
		UserDetails user=(UserDetails)session.createQuery("from UserDetails where uname='"+username+"'").getSingleResult();
		
		return user;
	
	}
	public boolean authenticate(String username, String password) {
		Session session=sessionFactory.getCurrentSession();
		UserDetails user;
		try{
		user=(UserDetails)session.createQuery("from UserUserDetails where uname='"+username+"' and password='"+password+"'").getSingleResult();
		return true;
		}catch(NoResultException nre)
		{
			nre.printStackTrace();
		}
		
		return false;
	}

	public List<UserDetails> listUsers(long userId) {
		Session session=sessionFactory.getCurrentSession();
		List<UserDetails> users=session.createQuery("from UserDetails where id<>"+userId).getResultList();
		
		return users;
	}

	
	public UserDetails getEmailId(String emailid, String password) 
	{
		Session session=sessionFactory.getCurrentSession();
		UserDetails usermail=(UserDetails)session.createQuery("from UserDetails where emailid='"+emailid+"' and password='"+password+"'").getSingleResult();
		
		return usermail;
	}
	
	

}
