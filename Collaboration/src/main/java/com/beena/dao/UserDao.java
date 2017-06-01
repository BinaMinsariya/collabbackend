package com.beena.dao;

import java.util.List;

import com.beena.model.UserDetails;

public interface UserDao
{
	
	public void addUser(UserDetails user);
	public void updateUser(UserDetails user);
	public void deleteUser(UserDetails user);
	public List<UserDetails> listUsers();
	public List<UserDetails> listUsers(long userId);
	public UserDetails getUserByUserId(long userId);
	public UserDetails getUserByUserName(String username);
	public boolean isExistingUser(UserDetails user);
	public UserDetails getEmailId(String emailid,String password);
	public boolean authenticate(String username,String password);
}	