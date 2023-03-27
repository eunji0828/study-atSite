package com.demo.ant.login.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ant.login.dao.LoginMapperDao;
import com.demo.ant.login.service.LoginService;

@Service("loginService")
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	LoginMapperDao dao;


	

}
