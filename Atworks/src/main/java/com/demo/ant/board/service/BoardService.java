package com.demo.ant.board.service;

import java.util.List;
import java.util.Map;

import com.demo.ant.board.criteria.Criteria;
import com.demo.ant.board.vo.BoardVO;

public interface BoardService {

	// �Խ���
	List<BoardVO> boardSelect(Criteria cri) throws Exception;

	// �Խù� �ۼ�
	void boardWrtie(BoardVO boardVo) throws Exception;

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
