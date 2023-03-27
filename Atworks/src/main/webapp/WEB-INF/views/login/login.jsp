<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%-- <%@ page session="false" %> --%>

<html>
<head>
	<title>login</title>
	<link rel="stylesheet" href="../../css/login/login.css">
</head>
<%@ include file="/WEB-INF/views/include/script.jsp" %>

<body>
<%@ include file="/WEB-INF/views/include/header.jsp" %>

<script>

</script>
 
<section class="main_wrap">
	<main class="main">
		<div class="container">
			<form action="/login/signIn" method="post">
			
				<p>아이디</p>
				<input type="text" placeholder="아이디를 입력하세요" id="userId" name="userId">
				<br>
				<br>
				
				<p>비밀번호</p>
				<input type="password" placeholder="비밀번호를 입력하세요" id="userPw" name="userPw">
				<br>
				<br>
				
				<div>
					<input type="checkBox" id="loginSaveBtn" name="loginSaveBtn">
					<label for="loginSaveBtn"><span>아이디 저장</span></label>
				</div>
				<div class="btn_box">
					<input type="submit" value="로그인" class="login_btn btn">
					<input type="button" value="취소" class="cancel_btn btn">
				</div>
				
			</form>
		</div>
	</main>
</section>
<%@ include file="/WEB-INF/views/include/footer.jsp" %>
<script src="../../js/login/login.js"></script>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
</body>
</html>
