package com.ayurvedicGyan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayurvedicGyan.UserRepos.userRepos;
import com.ayurvedicGyan.service.userService;
import com.ayurvedicGyan.userEntity.LoginEntity;
@Service
public class userServiceImpl implements userService {
	@Autowired
	userRepos userRepo;
//	@Override
//	public LoginEntity login(LoginEntity logEnt) {
//		
//		return userRepo.save(logEnt);
//	}
	
	
	@Override
	public String login(LoginEntity logEnt) {
		userRepo.save(logEnt);
		return "loginPage";
	}

}
