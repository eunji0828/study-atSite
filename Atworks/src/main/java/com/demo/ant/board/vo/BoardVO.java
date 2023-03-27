package com.demo.ant.board.vo;

import java.sql.Date;

// �Խ��� entity

public class BoardVO {

	private int boardNo;			// �Խ��� ��ȣ
	private int userNo;				// ���� ��ȣ
	private Date boardDate;			// �Խ��� �ۼ���
	private Date boardUpdateDate;	// �Խ��� ������
	private String boardTitle;		// �Խ��� ����
	private String boardContent;	// �Խ��� ����
	private int boardHit;			// �Խ��� ��ȸ��
	private int boardLike;			// �Խ��� ���ƿ��
	private int boardFilNo;			// �Խ��� ���� ��ȣ
	private int cmtNo;				// �Խ��� ��� ��ȣ
	private String userNick;		// ���� �г���
	
	
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public Date getBoardDate() {
		return boardDate;
	}
	public void setBoardDate(Date boardDate) {
		this.boardDate = boardDate;
	}
	public Date getBoardUpdateDate() {
		return boardUpdateDate;
	}
	public void setBoardUpdateDate(Date boardUpdateDate) {
		this.boardUpdateDate = boardUpdateDate;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public int getBoardHit() {
		return boardHit;
	}
	public void setBoardHit(int boardHit) {
		this.boardHit = boardHit;
	}
	public int getBoardLike() {
		return boardLike;
	}
	public void setBoardLike(int boardLike) {
		this.boardLike = boardLike;
	}
	public int getBoardFilNo() {
		return boardFilNo;
	}
	public void setBoardFilNo(int boardFilNo) {
		this.boardFilNo = boardFilNo;
	}
	public int getCmtNo() {
		return cmtNo;
	}
	public void setCmtNo(int cmtNo) {
		this.cmtNo = cmtNo;
	}
	public String getUserNick() {
		return userNick;
	}
	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}
	
	
	@Override
	public String toString() {
		return "BoardVO [boardNo=" + boardNo + ", userNo=" + userNo + ", boardDate=" + boardDate + ", boardUpdateDate="
				+ boardUpdateDate + ", boardTitle=" + boardTitle + ", boardContent=" + boardContent + ", boardHit="
				+ boardHit + ", boardLike=" + boardLike + ", boardFilNo=" + boardFilNo + ", cmtNo=" + cmtNo
				+ ", userNick=" + userNick + ", getBoardNo()=" + getBoardNo() + ", getUserNo()=" + getUserNo()
				+ ", getBoardDate()=" + getBoardDate() + ", getBoardUpdateDate()=" + getBoardUpdateDate()
				+ ", getBoardTitle()=" + getBoardTitle() + ", getBoardContent()=" + getBoardContent()
				+ ", getBoardHit()=" + getBoardHit() + ", getBoardLike()=" + getBoardLike() + ", getBoardFilNo()="
				+ getBoardFilNo() + ", getCmtNo()=" + getCmtNo() + ", getUserNick()=" + getUserNick() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
}
