package com.demo.ant.register.service;

import com.demo.ant.register.vo.RegisterVO;

public interface RegisterService {

	// ȸ������ ���
	void signUpInsert(RegisterVO registerVo) throws Exception;

	// ���̵� �ߺ� üũ
	int idCheck(String userId) throws Exception;

	// �г��� �ߺ� üũ
	int nickCheck(String userNick) throws Exception;


}
