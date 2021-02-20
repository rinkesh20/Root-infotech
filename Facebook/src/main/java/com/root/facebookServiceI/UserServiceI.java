package com.root.facebookServiceI;

import java.util.List;

import com.root.model.User;

public interface UserServiceI 
{
	public List<User> addUser( User user);
	public User getUsre (String username, String password);
	 public Long validateUser(String userName, String userPassword); 
}
