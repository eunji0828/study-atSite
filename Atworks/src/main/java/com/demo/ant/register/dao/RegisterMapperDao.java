package com.demo.ant.register.dao;

import com.demo.ant.register.vo.RegisterVO;
import com.demo.data.annotation.PrimaryMapperRepository;

@PrimaryMapperRepository
public interface RegisterMapperDao {

	// 회원가입
	public void signUpInsert(RegisterVO registerVo) throws Exception;

	// 아이디 중복 체크
	public int idCheck(String userId) throws Exception;

	// 닉네임 중복 체크
	public int nickCheck(String userNick) throws Exception;


}
