package com.demo.ant.register.vo;


// 회원가입 entity

public class RegisterVO {
	
	private String userNo; 				// 유저 번호
	private String userId;				// 유저 아이디
	private String userPw;				// 유저 비밀번호
	private String userNm;				// 유저 이름
	private String userNick;			// 유저 별명
	private String userGender;			// 유저 성별
	private String userBirth;			// 유저 생일
	private String userPhone;			// 유저 핸드폰 번호
	private String userEmail;			// 유저 이메일
	private String userPost;			// 유저 우편번호
	private String userAddr;			// 유저 주소
	private String userDetailAddr;		// 유저 상세주소
	
	
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
