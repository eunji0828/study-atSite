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

	// ȸ������ ���
	@Override
	public void signUpInsert(RegisterVO registerVo) throws Exception {
		dao.signUpInsert(registerVo);
	}

	// ���̵� �ߺ� üũ
	@Override
	public int idCheck(String userId) throws Exception {
		int idResult = dao.idCheck(userId);
		return idResult;
	}

	// �г��� �ߺ�üũ
	@Override
	public int nickCheck(String userNick) throws Exception {
		int nickResult = dao.nickCheck(userNick);
		return nickResult;
	}


	
	
}
