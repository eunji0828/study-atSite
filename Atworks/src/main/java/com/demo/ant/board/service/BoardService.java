package com.demo.ant.board.service;

import java.util.List;
import java.util.Map;

import com.demo.ant.board.criteria.Criteria;
import com.demo.ant.board.vo.BoardVO;

public interface BoardService {

	// 게시판
	List<BoardVO> boardSelect(Criteria cri) throws Exception;

	// 게시물 작성
	void boardWrtie(BoardVO boardVo) throws Exception;

	// 게시물 디테일 페이지
	Map<String, Object> boardDetaiSelect(BoardVO boardVo) throws Exception;

	// 총 게시물 수 
	int countBoardList() throws Exception;

	// 게시물 수정
	Map<String, Object> boardModify(BoardVO boardVo) throws Exception;

	// 게시글 삭제
	void boardDelete(int boardNo) throws Exception;

	// 조회수 증가
	void boardHit(BoardVO boardVo) throws Exception;

}
