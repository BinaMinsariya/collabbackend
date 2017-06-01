package com.beena.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.beena.dao.UserDao;
import com.beena.model.UserDetails;

@RestController
public class UserRestController 
{

	@Autowired
	UserDao userDao;

	@GetMapping(value="/user/")
	public ResponseEntity<List<UserDetails>>  listAllUsers()
	{
		
        List<UserDetails> users = userDao.listUsers();
  
        if(users.isEmpty()){
            return new ResponseEntity<List<UserDetails>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<UserDetails>>(users, HttpStatus.OK);

	}
	
	@PostMapping(value = "/user/")
    public ResponseEntity<Void> createUser(@RequestBody UserDetails user) {
        System.out.println("Creating User " + user.getUname());
  
        if (userDao.isExistingUser(user)) {
            System.out.println("A User with name " + user.getUname() + " already exist");
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
  
        userDao.addUser(user);
  
       
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }
	
	@PostMapping("/login")
	public ResponseEntity<UserDetails> loginemail(@RequestBody UserDetails user)
	{
		System.out.println("get the email id :"+user.getEmailid());
		
		UserDetails usere = userDao.getEmailId(user.getEmailid(),user.getPassword());
		if(usere!=null)
		{
		return new ResponseEntity<UserDetails>(usere,HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<UserDetails>(user,HttpStatus.UNAUTHORIZED);
		}
	}
	
}