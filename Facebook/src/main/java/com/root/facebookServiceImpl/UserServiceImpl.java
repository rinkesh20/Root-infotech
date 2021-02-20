package com.root.facebookServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.root.facebookServiceI.UserServiceI;
import com.root.facebookServiceRepo.UserRepoI;
import com.root.model.User;

@Service
public class UserServiceImpl implements UserServiceI
{
	@Autowired
	UserRepoI userRepo;
	@Override
	public List<User> addUser(User user)
	{
		userRepo.save(user);
		return userRepo.findAll();
		
	}
	@Override
	public User getUsre(String username, String password) 
	{
		
		return userRepo.findByUsernameAndPassword(username, password);
	}
	
	  @Override public Long validateUser(String userName, String userPassword) 
	  {
	  Long count=userRepo.validateUser(userName, userPassword); return count; 
	  }
	 
}
