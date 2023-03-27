package com.demo.ant.login.dao;


import com.demo.ant.register.vo.RegisterVO;
import com.demo.data.annotation.PrimaryMapperRepository;

@PrimaryMapperRepository
public interface LoginMapperDao {

	// 로그인하기
	RegisterVO signInSelect(RegisterVO registerVo) throws Exception;

}
