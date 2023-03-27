// 패키지 선언
package com.demo.ant.board.web;

// 패키지 가져오기
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.demo.ant.board.criteria.Criteria;
import com.demo.ant.board.pagemaker.PageMaker;
import com.demo.ant.board.service.BoardService;
import com.demo.ant.board.vo.BoardVO;


// 클래스 블록
@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	BoardService boardService;
	
	
	private static final Logger log = LoggerFactory.getLogger(BoardController.class);
	
	// 게시판
	@GetMapping(value="/board")
	public ModelAndView board(BoardVO boardVo, HttpServletRequest request, Criteria cri) throws Exception {
		ModelAndView mv = new ModelAndView();
		
		// 페이징
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(boardService.countBoardList());
		
		List<BoardVO> boardList = boardService.boardSelect(cri);
		mv.addObject("boardList", boardList);
		mv.addObject("pageMaker", pageMaker);
			
		log.info("boardList = " + boardList);
		mv.setViewName("/board/board");
			
		return mv;
	}
	
	// 게시물 작성
	@GetMapping(value="/boardWrite")
	public ModelAndView boardWrtie(HttpServletRequest request) throws Exception{
		ModelAndView mv = new ModelAndView();
		log.info("boardWrtieController ###");
		
		HttpSession session = request.getSession();
		session.getAttribute("userNick");	// 닉네임
		session.getAttribute("userNo");
		
		// 로그인 되어있는지 확인
		//int userNo = 0;
		
		if(session.getAttribute("userNo") != null) {
			//String change = String.valueOf(session.getAttribute("userNo"));
			mv.setViewName("/board/boardWrite");
			
		} else {
			
			mv.setViewName("/register/login");
			
		}
	
		return mv;
	}
	
	@PostMapping(value="/boardWrite")
	public ModelAndView boardWrite(BoardVO boardVo) throws Exception{
		ModelAndView mv = new ModelAndView();
		boardService.boardWrtie(boardVo);
		mv.setViewName("/board/board");
		return mv;
	
	
	}
	
	// 게시물 디테일 페이지
	@GetMapping(value="/boardDetail")
	public ModelAndView boardDetail(BoardVO boardVo, Criteria cri) throws Exception{
		
		ModelAndView mv = new ModelAndView();
		
		// 조회수 증가
		boardService.boardHit(boardVo);
		
		mv.setViewName("/board/boardDetail");
		mv.addObject("boardDetail", boardService.boardDetaiSelect(boardVo));
		
		// 페이징
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		mv.addObject("page", cri.getPage());
		mv.addObject("pageMaker", pageMaker);
		
		return mv;
		
	}
	
	// 게시물 수정
	@PostMapping(value="/boardModify")
	public ModelAndView boardModify(BoardVO boardVo, Criteria cri) throws Exception{
		
		ModelAndView mv = new ModelAndView();
		int boardNo = boardVo.getBoardNo();
		
		// 페이징
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		mv.addObject("page", cri.getPage());
		mv.addObject("pageMaker", pageMaker);
		
		mv.setViewName("/board/boardModify" + boardNo);
		return mv;
	}
	
	/*
	 * @PostMapping(value="/boardModify") public ModelAndView
	 * boardModifyPost(BoardVO boardVo, Criteria cri, RedirectAttributes redAttr)
	 * throws Exception{
	 * 
	 * ModelAndView mv = new ModelAndView();
	 * 
	 * mv.addObject("boardNo", boardVo.getBoardNo());
	 * boardService.boardModify(boardVo);
	 * 
	 * redAttr.addAttribute("page", cri.getPage());
	 * redAttr.addAttribute("perPageNum", cri.getPerPageNum());
	 * 
	 * mv.setViewName("/board/boardModify");
	 * 
	 * return mv; }
	 */
	
	// 게시물 삭제 
	@PostMapping(value="/boardDelete")
	public ModelAndView boardDelete(BoardVO boardVo, Criteria cri, RedirectAttributes redAttr) throws Exception{
		
		ModelAndView mv = new ModelAndView();
		log.info("boardDeleteController ###");
		
		redAttr.addAttribute("page", cri.getPage());
		redAttr.addAttribute("perPageNum", cri.getPerPageNum());
		int boardNo = boardVo.getBoardNo();
		boardService.boardDelete(boardNo);
		mv.setViewName("redirect:/board/board");
		
		return mv;
	}
	
	
	
	
}
