package com.demo.ant.board.dao;

import java.util.List;
import java.util.Map;

import com.demo.ant.board.criteria.Criteria;
import com.demo.ant.board.vo.BoardVO;
import com.demo.data.annotation.PrimaryMapperRepository;

@PrimaryMapperRepository
public interface BoardMapperDao {

	// �Խ���
	List<BoardVO> boardSelect(Criteria cri) throws Exception;

	// �Խù� �ۼ�
	void boardWrite(BoardVO boardVo) throws Exception;

	// �Խù� ������ ������
	Map<String, Object> boardDetaiSelect(BoardVO boardVo) throws Exception;

	// �� �Խù� ��
	int countBoardList() throws Exception;

	// �Խù� ����
	Map<String, Object> boardModify(BoardVO boardVo) throws Exception;

	// �Խñ� ����
	void boardDelete(int boardNo) throws Exception;

	// ��ȸ�� ����
	void boardHit(BoardVO boardVo) throws Exception;
 
	
}
