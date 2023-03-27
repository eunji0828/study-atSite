<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%-- <%@ page session="false" %> --%>

<html>
<head>
	<title>atworks</title>
	<link rel="stylesheet" href="../../css/register/register.css">
</head>
<%@ include file="/WEB-INF/views/include/script.jsp" %>

<body>
<%@ include file="/WEB-INF/views/include/header.jsp" %>

<script>

</script>
 
<section class="main_wrap">
	<main class="main">
		<form action="/register/signUp" method="post">
			<div class="container">
				<label for="userId">아이디</label>
				<div>
					<input type="text" placeholder="아이디를 입력하세요" id="userId" name="userId">
					<input type="button" id="id_chk_btn" onclick="idCheck();" value="중복확인" style="border:1px solid #DBDEE3;">중복확인</button>
				</div>
				<span id="message"></span>
				<br>
				
				<label for="userPw">비밀번호</label>
				<input type="password" placeholder="비밀번호를 입력하세요" id="userPw">
				<span></span>
				<br>
				
				<label for="userPw2">비밀번호 확인</label>
				<input type="password" placeholder="비밀번호를 확인하세요" name="userPw" id="userPw2">
				<span></span>
				<br>
				
				<label for="userNm">이름</label>
				<input type="text" placeholder="이름을 입력하세요" id="userNm" name="userNm">
				<span></span>
				<br>
				
				<label for="userNick">닉네임</label>
				<div>
				<input type="text" placeholder="닉네임을 입력하세요" id="userNick" name="userNick">
				<button id="nick_chk_btn" onclick="nickCheck(); return false" style="border:1px solid #DBDEE3;">중복확인</button>
				</div>
				<span id="message2"></span>
				<br>
				
				성별
				<div id="gender_box">
					<label for="female">여성</label><input type="radio" name="userGender" value="female" id="female">
					<label for="male" id="male_margin">남성</label><input type="radio" name="userGender" value="male" id="male">
				</div>
				<br>
				
				<label for="userBirth">생년월일</label>
				<div>
					<input type="date" id="birthDate" name="userBirth">
				</div>
				<!-- <input type="text" placeholder="생일을 입력하세요" name="user_birth" id="user_birth"> -->
				<br>
				
				<label for="userPhone">핸드폰번호</label>
				<input type="text" placeholder="핸드폰 번호를 입력하세요" name="userPhone" id="userPhone">
				<span></span>
				<br>
				
				<label for="userEmail">이메일</label>
				<input type="text" placeholder="이메일을 입력하세요" name="userEmail" id="userEmail">
				<span></span>
				<br>
				
				<label for="userAddr">주소</label>
				<div>
					<input type="text" id="sample6_postcode" name="userPost" placeholder="우편번호">
					<input type="button" id="Post_btn" onclick="sample6_execDaumPostcode()" value="우편번호 찾기" style="border:1px solid #DBDEE3;">
				</div>
				<br>
				<input type="text" id="sample6_address" name="userAddr" placeholder="주소"><br>
				<input type="text" id="sample6_detailAddress" name="userDetailAddr" placeholder="상세주소를 입력하세요">
				<br>
				
				<div id="register_btn">
					<input type="submit" value="회원가입" class="chk_btn reg_btn" style="border:1px solid #DBDEE3;">
					<input type="button" value="취소" class="cancel_btn reg_btn" style="border:1px solid #DBDEE3;">
				</div>
			</div>
		</form>
	</main>
</section>
<%@ include file="/WEB-INF/views/include/footer.jsp" %>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script src="../../js/register/register.js"></script>
</body>
</html>
