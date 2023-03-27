package com.demo.ant.board.pagemaker;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.demo.ant.board.criteria.Criteria;

// ����¡�� ó���ϴ� 
public class PageMaker {
	
	private Criteria cri;
	private int totalCount;				// �� �Խñ� ��
	private int startPage; 				// ���� ������ ��ȣ
	private int endPage;				// ������ ������ ��ȣ
	private boolean prev;				// ���� ��ư ���� ����
	private boolean next;				// ���� ��ư ���� ����
	private int displayPageNum = 5; 	// ȭ�鿡 ������ ������ ��ư�� ��
	
	
	public Criteria getCri() {
		return cri;
	}
	
	public void setCri(Criteria cri) {
		this.cri = cri;
	}
	
	public int getTotalCount() {
		return totalCount;
	}
	
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
		calcData();
	}
	
	private void calcData() {
		
		// �� ������ ��ȣ = (���� ������ ��ȣ / ȭ�鿡 ������ ������ ��ȣ�� ����) * ȭ�鿡 ������ ������ ��ȣ�� ����
		endPage = (int) (Math.ceil(cri.getPage() / (double) displayPageNum) * displayPageNum);
		
		// ���������� ��ȣ = (�� ������ ��ȣ - ȭ�鿡 ������ ������ ��ȣ�� ����) + 1
		startPage = (endPage - displayPageNum) + 1;
		if(startPage <= 0) startPage = 1;
		
		// ������ ������ ��ȣ = �� �Խñ� �� / �� �������� ������ �Խñ��� ����
		int tempEndPage = (int) (Math.ceil(totalCount / (double) cri.getPerPageNum()));
		if(endPage > tempEndPage) {
			endPage = tempEndPage;
		}
		
		// ���� ��ư ���� ���� = ���������� ��ȣ == 1 ? false : true
		prev = startPage == 1 ? false : true;
		
		// ���� ��ư ���� ���� = �������� ��ȣ * �� �������� ������ �Խñ��� ���� < �� �Խñ��� �� ? true : false
		next = endPage * cri.getPerPageNum() < totalCount ? true : false;
	}
	
	public int getStartPage() {
		return startPage;
	}
	
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	
	public int getEndPage() {
		return endPage;
	}
	
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	
	public boolean isPrev() {
		return prev;
	}
	
	public void setPrev(boolean prev) {
		this.prev = prev;
	}
	
	public boolean isNext() {
		return next;
	}
	
	public void setNext(boolean next) {
		this.next = next;
	}
	
	public int getDisplayPageNum() {
		return displayPageNum;
	}
	
	public void setDisplayPageNum(int displayPageNum) {
		this.displayPageNum = displayPageNum;
	}
	
	public String makeQueryPage(int page) {
		UriComponents uri = UriComponentsBuilder.newInstance()
				.queryParam("page", page)
				.queryParam("perPageNum", cri.getPerPageNum())
				.build();
		return uri.toUriString();
	}
	
	public String makeQueryPage(int boardNo, int page) {
		UriComponents uri = UriComponentsBuilder.newInstance()
				.queryParam("boardNo", boardNo)
				.queryParam("page", page)
				.queryParam("perPageNum", cri.getPerPageNum())
				.build();
		
		return uri.toUriString();
	}
	
	
	
	
	
	
	
	

}
