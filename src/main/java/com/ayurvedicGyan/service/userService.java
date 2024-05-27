package com.ayurvedicGyan.service;

import org.springframework.stereotype.Service;

import com.ayurvedicGyan.userEntity.LoginEntity;
@Service
public interface userService {
	public String login(LoginEntity logEnt);

}
