package com.ayurvedicGyan.userEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//@Table(name = "IdPass")
public class LoginEntity {
	@Id
	private String username;
	private String Password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "LoginEntity [username=" + username + ", Password=" + Password + "]";
	}

	public LoginEntity(String username, String password) {
		super();
		this.username = username;
		Password = password;
	}


}
