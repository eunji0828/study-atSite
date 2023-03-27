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

	// 게시판
	@Override
	public List<BoardVO> boardSelect(Criteria cri) throws Exception {
		return dao.boardSelect(cri);
	}

	// 게시물 작성
	@Override
	public void boardWrtie(BoardVO boardVo)  throws Exception  {
		this.dao.boardWrite(boardVo);
		
	}

	// 게시물 디테일 페이지
	@Override
	public Map<String, Object> boardDetaiSelect(BoardVO boardVo) throws Exception {
		return dao.boardDetaiSelect(boardVo);
	}

	// 총 게시물 수
	@Override
	public int countBoardList() throws Exception {
		return dao.countBoardList();
	}

	// 게시물 수정
	@Override
	public Map<String, Object> boardModify(BoardVO boardVo) throws Exception {
		return dao.boardModify(boardVo);
	}

	// 게시글 삭제
	@Override
	public void boardDelete(int boardNo) throws Exception {
		dao.boardDelete(boardNo);
	}

	// 조회수 증가
	@Override
	public void boardHit(BoardVO boardVo) throws Exception {
		dao.boardHit(boardVo);
		
	}
	

}
