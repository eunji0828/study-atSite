package com.demo.ant.register.service;

import com.demo.ant.register.vo.RegisterVO;

public interface RegisterService {

	// 회원가입 등록
	void signUpInsert(RegisterVO registerVo) throws Exception;

	// 아이디 중복 체크
	int idCheck(String userId) throws Exception;

	// 닉네임 중복 체크
	int nickCheck(String userNick) throws Exception;


}
