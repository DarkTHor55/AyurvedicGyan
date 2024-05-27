package com.ayurvedicGyan.UserRepos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ayurvedicGyan.userEntity.LoginEntity;

public interface userRepos  extends JpaRepository<LoginEntity, String>{

}
