package com.demo.ant.board.criteria;

// 게시판 페이징 vo
public class Criteria {
	
	private int page;			// 편재 페이지 번호
	private int perPageNum;		// 한 페이지당 보여줄 게시글의 갯수
	
	// 특정 페이지의 게시글 시작 번호, 게시글 시작 행 번호
	public int getPageStart() {
		return (this.page-1) * perPageNum;
		// 현재 페이지의 게시글 시작 번호 = (현재 페이지 번호 -1) * 페이지당 보여줄 게시글 갯수
		//                           (5-1) * 10 = 40
	}
	
	public Criteria() {  // 기본생성자
		this.page = 1;
		this.perPageNum = 10;
	}
	
	public int getPage() {
		return page;
	}
	
	public void setPage(int page) {
		if(page <= 0) {
			this.page = 1;
		} else {
			this.page = page;
		}
	}
	
	public int getPerPageNum() {
		return perPageNum;
	}
	
	public void setPerPageNum(int pageCount) {
		int cnt = this.perPageNum;
		if(pageCount != cnt) {
			this.perPageNum = cnt;
		} else {
			this.perPageNum = pageCount;
		}
	}
	
	

}
