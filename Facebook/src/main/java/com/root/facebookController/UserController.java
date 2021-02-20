package com.root.facebookController;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.root.constance.CodeConstance;
import com.root.constance.CommonConstance;
import com.root.dto.ResponceDTO;
import com.root.facebookServiceI.UserServiceI;
import com.root.model.User;

@RestController
public class UserController 
{
	@Autowired
	UserServiceI userService;
	
	@PostMapping(value = "/addUser")
	public List<User> addUser(@RequestBody User user)
	{
		List<User> userList= userService.addUser(user);
		return userList;
		
	}
	
	@GetMapping (value = "/getUser/{usern}/{userpass}")
	public ResponseEntity<ResponceDTO> getUsre(@PathVariable ("usern") String username, @PathVariable ("userpass") String password) 
	{
		ResponceDTO resp=new ResponceDTO();
		Long count=userService.validateUser(username, password);
		if(count>0)
		{
		User user=userService.getUsre(username, password);
		resp.setTimestamp(new Date().toString());
		resp.setResponceMsg(CommonConstance.SUCCESS);
		resp.setResponceCode(CodeConstance.SUCCESS);
		resp.setRecord(user);
		return new ResponseEntity<ResponceDTO>(resp, HttpStatus.OK);
		}
		
		else
		{
			resp.setTimestamp(new Date().toString());
			resp.setResponceMsg(CommonConstance.ID_NOT_PRESENT);
			resp.setResponceCode(CodeConstance.FAILUER);
			return new ResponseEntity<ResponceDTO>(resp, HttpStatus.NOT_FOUND);
		}
		
	}
	
	@GetMapping ("/pubgplayer/{username}/{password}")
	public Long authanticatePubGPlayer(@PathVariable ("username") String username, @PathVariable ("password") String password)
	{
		Long count=userService.validateUser(username, password);
		return count;
		
	}
}


















