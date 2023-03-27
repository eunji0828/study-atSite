package com.demo.ant.board.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ant.board.service.BoardService;
import com.demo.ant.board.vo.BoardVO;
import com.demo.ant.board.criteria.Criteria;
import com.demo.ant.board.dao.BoardMapperDao;

@Service("boardService")
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	BoardMapperDao dao;

	// �Խ���
	@Override
	public List<BoardVO> boardSelect(Criteria cri) throws Exception {
		return dao.boardSelect(cri);
	}

	// �Խù� �ۼ�
	@Override
	public void boardWrtie(BoardVO boardVo)  throws Exception  {
		this.dao.boardWrite(boardVo);
		
	}

	// �Խù� ������ ������
	@Override
	public Map<String, Object> boardDetaiSelect(BoardVO boardVo) throws Exception {
		return dao.boardDetaiSelect(boardVo);
	}

	// �� �Խù� ��
	@Override
	public int countBoardList() throws Exception {
		return dao.countBoardList();
	}

	// �Խù� ����
	@Override
	public Map<String, Object> boardModify(BoardVO boardVo) throws Exception {
		return dao.boardModify(boardVo);
	}

	// �Խñ� ����
	@Override
	public void boardDelete(int boardNo) throws Exception {
		dao.boardDelete(boardNo);
	}

	// ��ȸ�� ����
	@Override
	public void boardHit(BoardVO boardVo) throws Exception {
		dao.boardHit(boardVo);
		
	}
	

}
