/**
 * 회원가입 
 */


let id = document.getElementById("userId");								// 아이디 
let pw = document.getElementById("userPw");								// 비밀번호
let pw2 = document.getElementById("userPw2");							// 비밀번호 확인
let name = document.getElementById("userNm");							// 이름
let nick = document.getElementById("userNick");							// 닉네임
let phone = document.getElementById("userPhone");						// 핸드폰번호
let email = document.getElementById("userEmail");						// 이메일	
let postCode = document.getElementById("sample6_postcode");				// 우편번호
let addr = document.getElementById("sample6_address");					// 주소
let detail_addr = document.getElementById("sample6_detailAddress");		// 상세주소
let register_btn = document.querySelector(".chk_btn");					// 회원가입 버튼
let cancel_btn = document.querySelector(".cancel_btn");					// 취소버튼 
let message = document.getElementById("message");						// id span
let message2 = document.getElementById("message2");						// 닉네임 span
let id_chk_btn = document.getElementById("nick_chk_btn");				// id 중복확인 버튼
let nick_chk_btn = document.getElementById("nick_chk_btn");				// 닉네임 중복확인 버튼

/* 정규표현식 */
const idInput = /^[a-zA-Z0-9]*$/;
// 아이디 - 영문(대,소문자 상관x) 숫자 작성 

const pwInput = /(?=.*\d)+(?=.*[~`!@#$%\^&*()-+=])+(?=.*[a-z])(?=.*[A-Z])+.{1,}$/;
// 비밀번호 - 영문(대, 소문자), 특수문자, 숫자 1개 이상 작성

const nmInput = /^[a-zA-Z가-힣]*.{3,}$/;
// 이름 = 영어(대, 소문자 상관x), 한글만 3글자 이상 작성

const nickInput = /^[a-zA-Z\가-힣]*.{2,}$/;
// 닉네임 = 영어(대, 소문자 상관x), 한글 2글자 이상

// const birthInput = /^[1-2]{1}[0-9]{3}[0-1]{1}[0-9]{1}[0-3]{1}[0-9]{1}$/;
// 생년월일 

const phoneInput = /^01([0|1|6|7|8]?)-([0-9]{3,4})-([0-9]{4})$/;
// 핸드폰 번호

const emailInput = /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/;
// 이메일 주소 

const passCheck = /(pass){11,11}/;
// 가입하기 버튼 클릭 시 pass 확인


/* 주소 입력 */
  function sample6_execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 각 주소의 노출 규칙에 따라 주소를 조합한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var addr = ''; // 주소 변수

                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                    addr = data.roadAddress;
                } else { // 사용자가 지번 주소를 선택했을 경우(J)
                    addr = data.jibunAddress;
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('sample6_postcode').value = data.zonecode;
                document.getElementById("sample6_address").value = addr;

                // 커서를 상세주소 필드로 이동한다.
                document.getElementById("sample6_detailAddress").focus();
            }

        }).open();
    }

/* 생일 날짜 오늘 이후 선택 못하도록 */
var now_utc = Date.now(); // 지금 날짜를 밀리초로 변환
// getTimezoneoffset()은 현재 시간과의 차이를 분 단위로 반환
var timeoff = new Date().getTimezoneOffset()*60000; // 분단위를 밀리초로 변환
// new Date(now_utf-timeoff).toISOString() '2022-05-11T18:09:38.134Z'를 반환
var today = new Date(now_utc-timeoff).toISOString().split("T")[0];
document.getElementById("birthDate").setAttribute("max", today); // 생일




let flag = ['fail', 'fail', 'fail', 'fail', 'fail', 'fail', 'fail', 'fail', 'fail', 'fail', 'fail'];


/* id 확인 */
id.addEventListener("keyup", function(){
	
	if(idInput.test(id.value) !== true){
		
		message.innerHTML=("아이디는 영문과 숫자를 사용해주세요");
		message.style.color="red";
		flag[0] = 'fail';
	
	} else if(id.value.length>15 || id.value.length<5){
		
		message.innerHTML=("아이디는 5~15 사이로 작성해주세요");
		message.style.color="red";
		flag[0] = 'fail';
		
	} else if(idInput.test(id.value) == true){
		
		message.innerHTML=("사용 가능합니다");
		message.style.color="blue";
		flag[0] = 'pass';
		
	}
	
});

/* 아이디 중복 체크 */
function idCheck() {
	$.ajax({
		url : "/register/idCheck",
		type : "POST",
		dataType : "JSON",
		data : {id : id},
		success : function(data){
			if(data == 1){
				alert("이미 사용중인 아이디입니다");
				flag[1] = 'fail';
			} else if(data == 0){
				alert("사용 가능합니다");
				flag[1] = 'pass';
			}
		}
	});
}


/* pw 확인 */
pw.addEventListener("keyup", function(){
	
	if(pwInput.test(pw.value) !== true){
		
		pw.nextElementSibling.innerHTML="비밀번호는 영문 대/소문자, 특수문자, 숫자를 사용해주세요";
		pw.nextElementSibling.style.color="red";
		flag[2] = 'fail';
		
	}else if(pwInput.test(pw.value) == true){
			
		pw.nextElementSibling.innerHTML="사용 가능합니다";
		pw.nextElementSibling.style.color="blue";
		flag[2] = 'pass';
		
	}
	
});

/* pw 재확인 */
pw2.addEventListener("keyup", function(){
	
	if(pw2.value != pw.value){
		
		pw2.nextElementSibling.innerHTML="위의 입력한 비밀번호와 같지 않습니다";
		pw2.nextElementSibling.style.color="red";
		flag[3] = 'fail';
		
	} else if(pwInput.test(pw.value) !== true){
		
		pw2.nextElementSibling.innerHTML="위 입력한 비밀번호 조건이 맞는지 확인해주세요";
		pw2.nextElementSibling.style.color="red";
		flag[3] = 'fail';
	
	}else if(pw2.value == pw.value){
		
		pw2.nextElementSibling.innerHTML="위의 입력한 비밀번호와 같습니다";
		pw2.nextElementSibling.style.color="blue";
		flag[3] = 'pass';
		
	}
	
});

/* 이름 확인 */
name.addEventListener("keyup", function(){
	
	if(nmInput.test(name.value) != true){
		
		name.nextElementSibling.innerHTML="영문 또는 한글을 이용해 이름을 입력해주세요";
		name.nextElementSibling.style.color="red";
		flag[4] = 'fail';
		
	} else if(nmInput.test(name.value) == true){
		
		name.nextElementSibling.innerHTML="사용 가능합니다";
		name.nextElementSibling.style.color="blue";
		flag[4] = 'pass';
		
	}
	
});

/* 닉네임 확인 */
nick.addEventListener("keyup", function(){
	
	if(nickInput.test(nick.Value) != true){
		
		message2.innerHTML=("영문 또는 한글을 이용해 닉네임을 입력해주세요");
		message2.style.color="red";
		flag[5] = 'fail';
		
	} else if(nickInput.test(nick.value) == true){
		
		message2.innerHTML=("사용가능합니다");
		message2.style.color="blue";
		flag[5] = 'pass';
		
	}
});

/* 닉네임 중복 체크 */
function nickCheck() {
	$.ajax({
		url : "/register/nickCheck",
		type : "POST",
		dataType : "JSON",
		data : {nick : nick},
		success : function(data){
			if(data == 1){
				alert("이미 사용중인 닉네임입니다");
				flag[6] = 'fail';
			} else if(data == 0){
				alert("사용 가능한 닉네임입니다");
				flag[6] = 'pass';
			}
		}
	});
}

/* 성별 체크 */
let radios = document.querySelectorAll('input[name="userGender"]'); 

for(let i = 0; i < radios.length; i++){
	radios[i].addEventListener("change", function(){
		
		let val = this.value;
		console.log(val);
		flag[7] = 'pass';
		
	});
	
}


/* 생일 확인 */
	birthDate.addEventListener("change", function(){
		
		let val2 = this.value;
		console.log(val2);
		flag[8] = 'pass';
		
	});

/* 핸드폰 번호 확인 */
phone.addEventListener("keyup", function(){
	
	if(phone.value.length == 3){
		
		phone.nextElementSibling.innerHTML="'-'포함하여 입력해주세요";
		phone.nextElementSibling.style.color="red";
		flag[9] = 'fail';
		
	} else if(phoneInput.test(phone.value) == true){
		
		phone.nextElementSibling.innerHTML="사용 가능합니다";
		phone.nextElementSibling.style.color="blue";
		flag[9] = 'pass';
		
	}
	
});

/* 이메일 확인 */
email.addEventListener("keyup", function(){
	
	if(emailInput.test(email.value) != true){
		
		email.nextElementSibling.innerHTML="사용할 수 있는 이메일을 입력하세요";
		email.nextElementSibling.style.color="red";
		flag[10] = 'fail';
		
	} else if(emailInput.test(email.value) == true){
		
		email.nextElementSibling.innerHTML="사용 가능합니다";
		email.nextElementSibling.style.color="blue";
		flag[10] = 'pass';
		
	}
		
});

/* 주소 확인 */
addr.addEventListener("keyup", function(){
	
	if(addr.value == null || addr.value == ' '){
		
		flag[11] = 'fail';
		
	} else if(addr.value != null || addr.value != ' '){
		
		flag[11] = 'pass';
		
	}
		
});


/* 회원가입 버튼 클릭 시 미작성 input 확인 */
register_btn.addEventListener("click", function(e){
	
	let check = '';
	for(let i = 0; i < flag.length; i++){
		
		check += flag[i];
		
	}
	
	console.log(flag);
	console.log(check);
	
	if(passCheck.test(check) !== true){
		
		alert("가입 양식을 다시 확인해주세요");
		e.preventDefault();
		
	} else if(flag[1] = 'fail'){
		alert("아이디 중복 체크는 필수입니다");
		e.preventDefault(); 
	
	} else if(flag[6] = 'fail'){
		alert("닉네임 중복 체크는 필수입니다");
		e.preventDefault();
	
	}else if(passCheck.test(check) == true){
		
		alert("가입을 축하합니다");
		return true;
		
	}
	
});

/* 취소 버튼 클릭 시 */
cancel_btn.addEventListener("click", function(){
	
	if(confirm("취소하겠습니까?") == true){
		location.href=("/main");
		
	} else {
		return false;
	}
	
});






