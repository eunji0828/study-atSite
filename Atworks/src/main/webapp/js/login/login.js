/**
 * 로그인
 */

let id = document.getElementById("userId");				// 아이디
let pw = document.getElementById("userPw");				// 비밀번호
let login = document.querySelector(".login_btn");		// 로그인버튼
let cancel = document.querySelector(".cancel_btn");		// 취소버튼

/* 정규표현식 */
const idInput = /^[a-zA-Z0-9]*$/;
// 아이디 - 영문(대,소문자 상관x) 숫자 작성 

const pwInput = /(?=.*\d)+(?=.*[~`!@#$%\^&*()-+=])+(?=.*[a-z])(?=.*[A-Z])+.{1,}$/;
// 비밀번호 - 영문(대, 소문자), 특수문자, 숫자 1개 이상 작성

// 로그인 버튼 클릭 
login.addEventListener("click", function(e){
	
	if(id.value == null || id.value == ''){
		alert("아이디를 입력하세요");
		e.preventDefault();
		
	} else if(pw.value == null || pw.value == ''){
		alert("비밀번호를 입력하세요");
		e.preventDefault();
		
	} else {
		return true;
	}
	
});

cancel.addEventListener("click", function(){
	
	if(confirm("취소하겠습니까?") == true){
		location.href=("/main");
	} else {
		return false;
	}
});