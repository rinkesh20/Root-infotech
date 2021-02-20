package com.root.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.root.constance.CodeConstance;
import com.root.constance.CommonConstance;
import com.root.dto.ResponceDTO;

@RestController
public class PubGController 
{
	@Autowired
	RestTemplate restTemp;
	
	@GetMapping(value ="/getplayer/{username}/{password}")
	public ResponseEntity<ResponceDTO> authanticatePlayer(@PathVariable ("username") String username, @PathVariable ("password") String password) 
	{
		ResponceDTO resp=new ResponceDTO();
		String url="http://localhost:8080/pubgplayer/"+username+"/"+password;
		Long count=restTemp.getForObject(url, Long.class);
		
		if(count>0)
		{
			resp.setTimeStamp(new Date().toString());
			resp.setResponceMsg(CommonConstance.SUCCESS);
			resp.setResponceCode(CodeConstance.SUCCESS);
			return new ResponseEntity<ResponceDTO>(resp, HttpStatus.OK);
		}
		
		else
		{
			resp.setTimeStamp(new Date().toString());
			resp.setResponceMsg(CommonConstance.ID_NOT_PRESENT);
			resp.setResponceCode(CodeConstance.FAILUER);
			return new ResponseEntity<ResponceDTO>(resp, HttpStatus.NOT_FOUND);
		}
		
		
		
		
		
	}
}
