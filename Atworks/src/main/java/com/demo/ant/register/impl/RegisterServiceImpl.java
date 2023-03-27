package com.demo.ant.register.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ant.register.dao.RegisterMapperDao;
import com.demo.ant.register.service.RegisterService;
import com.demo.ant.register.vo.RegisterVO;

@Service("registerService")
public class RegisterServiceImpl implements RegisterService {
	
	@Autowired
	RegisterMapperDao dao;

	// 회원가입 등록
	@Override
	public void signUpInsert(RegisterVO registerVo) throws Exception {
		dao.signUpInsert(registerVo);
	}

	// 아이디 중복 체크
	@Override
	public int idCheck(String userId) throws Exception {
		int idResult = dao.idCheck(userId);
		return idResult;
	}

	// 닉네임 중복체크
	@Override
	public int nickCheck(String userNick) throws Exception {
		int nickResult = dao.nickCheck(userNick);
		return nickResult;
	}


	
	
}
