<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"		uri="http://java.sun.com/jsp/jstl/core" %>


<section>
	<header class="header">
		<div class="logo">
			<h1><a href="/main">Atworks</a></h1>
		</div>
		<nav>
			<ul>
				<li class="before_sign"><a href="/board/board">게시판</a></li>
			</ul>
		</nav>
		<div class="util_menu">
             <ul>
            	<c:if test="${empty userId}">
					<li class="before_sign"><a href="/login/login">로그인</a></li>
					<li class="before_sign"><a href="/register/onLoad">회원가입</a></li>
				</c:if>
				
				<c:if test="${not empty userId}">
					<div>${userNick}님 환영합니다</div>
					<li class="before_sign"><a href="/login/logout">로그아웃</a></li>
				</c:if>
            </ul>
        </div>
	</header>
</section>