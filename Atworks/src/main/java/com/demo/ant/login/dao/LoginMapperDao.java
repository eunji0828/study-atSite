package com.demo.ant.login.dao;


import com.demo.ant.register.vo.RegisterVO;
import com.demo.data.annotation.PrimaryMapperRepository;

@PrimaryMapperRepository
public interface LoginMapperDao {

	// �α����ϱ�
	RegisterVO signInSelect(RegisterVO registerVo) throws Exception;

}
