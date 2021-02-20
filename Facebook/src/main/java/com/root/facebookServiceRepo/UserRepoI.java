package com.root.facebookServiceRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.root.model.User;

@Repository
public interface UserRepoI extends JpaRepository<User, Long> 
{
	
	  @Query(" select count(u.userId) from User u where u.username=:userName and u.password=:userPassword"  )
	  public Long validateUser(String userName, String userPassword);
	 
	
	public User findByUsernameAndPassword(String username, String password); 
}
