package com.demo.ant.board.criteria;

// �Խ��� ����¡ vo
public class Criteria {
	
	private int page;			// ���� ������ ��ȣ
	private int perPageNum;		// �� �������� ������ �Խñ��� ����
	
	// Ư�� �������� �Խñ� ���� ��ȣ, �Խñ� ���� �� ��ȣ
	public int getPageStart() {
		return (this.page-1) * perPageNum;
		// ���� �������� �Խñ� ���� ��ȣ = (���� ������ ��ȣ -1) * �������� ������ �Խñ� ����
		//                           (5-1) * 10 = 40
	}
	
	public Criteria() {  // �⺻������
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
