package com.demo.ant.register.dao;

import com.demo.ant.register.vo.RegisterVO;
import com.demo.data.annotation.PrimaryMapperRepository;

@PrimaryMapperRepository
public interface RegisterMapperDao {

	// ȸ������
	public void signUpInsert(RegisterVO registerVo) throws Exception;

	// ���̵� �ߺ� üũ
	public int idCheck(String userId) throws Exception;

	// �г��� �ߺ� üũ
	public int nickCheck(String userNick) throws Exception;


}
