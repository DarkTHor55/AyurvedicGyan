package com.ayurvedicGyan.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ayurvedicGyan.AyurvedicGyanApplication;
import com.ayurvedicGyan.service.userService;
import com.ayurvedicGyan.userEntity.LoginEntity;

@RestController
//@RequestMapping("/users")
public class userController {
	@Autowired
	userService userServ;
	
	@GetMapping("/tesst")
	public String testt() {
		return "Rohit is the boss";
	}
	
	@GetMapping("/Login")
	public String Log(@RequestBody LoginEntity logEnt) {
		String done=userServ.login(logEnt);
		return done;
	}

}
