package com.demo.ant.register.vo;


// ȸ������ entity

public class RegisterVO {
	
	private String userNo; 				// ���� ��ȣ
	private String userId;				// ���� ���̵�
	private String userPw;				// ���� ��й�ȣ
	private String userNm;				// ���� �̸�
	private String userNick;			// ���� ����
	private String userGender;			// ���� ����
	private String userBirth;			// ���� ����
	private String userPhone;			// ���� �ڵ��� ��ȣ
	private String userEmail;			// ���� �̸���
	private String userPost;			// ���� �����ȣ
	private String userAddr;			// ���� �ּ�
	private String userDetailAddr;		// ���� ���ּ�
	
	
	public String getUserNo() {
		return userNo;
	}
	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserNm() {
		return userNm;
	}
	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}
	public String getUserNick() {
		return userNick;
	}
	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getUserBirth() {
		return userBirth;
	}
	public void setUserBirth(String userBirth) {
		this.userBirth = userBirth;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPost() {
		return userPost;
	}
	public void setUserPost(String userPost) {
		this.userPost = userPost;
	}
	public String getUserAddr() {
		return userAddr;
	}
	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}
	public String getUserDetailAddr() {
		return userDetailAddr;
	}
	public void setUserDetailAddr(String userDetailAddr) {
		this.userDetailAddr = userDetailAddr;
	}
	
	
	@Override
	public String toString() {
		return "RegisterVO [userNo=" + userNo + ", userId=" + userId + ", userPw=" + userPw + ", userNm=" + userNm
				+ ", userNick=" + userNick + ", userGender=" + userGender + ", userBirth=" + userBirth + ", userPhone="
				+ userPhone + ", userEmail=" + userEmail + ", userPost=" + userPost + ", userAddr=" + userAddr
				+ ", userDetailAddr=" + userDetailAddr + ", getUserNo()=" + getUserNo() + ", getUserId()=" + getUserId()
				+ ", getUserPw()=" + getUserPw() + ", getUserNm()=" + getUserNm() + ", getUserNick()=" + getUserNick()
				+ ", getUserGender()=" + getUserGender() + ", getUserBirth()=" + getUserBirth() + ", getUserPhone()="
				+ getUserPhone() + ", getUserEmail()=" + getUserEmail() + ", getUserPost()=" + getUserPost()
				+ ", getUserAddr()=" + getUserAddr() + ", getUserDetailAddr()=" + getUserDetailAddr() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
