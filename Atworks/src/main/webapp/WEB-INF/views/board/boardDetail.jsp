<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<title>게시판 상세 페이지</title>
	<link rel="stylesheet" href="../../css/board/boardDetail.css">
</head>
<%@ include file="/WEB-INF/views/include/script.jsp" %>

<body>
<%@ include file="/WEB-INF/views/include/header.jsp" %>

<section class="main_wrap">
	<main class="main">
				
				<!-- 버튼 -->
				<div class="writeBtn">
					<c:if test="${userNo eq boardDetail.userNo}">
						<!-- 수정버튼 -->
						<form action="/board/boardModify" method="post">
							<input type="submit" value="수정" class="boardBtn modifyBtn">
						</form>
						
						<!-- 삭제버튼 -->
						<form action="/board/boardDelete" method="post">
							<input type="submit" value="삭제" class="boardBtn deleteBtn">
						</form>
					</c:if>
					
					<!-- 목록버튼 -->
					<input type="button" value="목록" class="boardBtn listBtn">
				</div>
				
				<div class="writeContainer">
					<table>
						<tr>
							<th>제목</th>
							<td>${boardDetail.boardTitle}</td>
						</tr>
						<tr>
							<th>작성자</th>
							<td>${boardDetail.userNick}</td>
						</tr>
						<tr>
							<th>작성날짜</th>
							<td>${boardDetail.boardDate}</td>
						</tr>
						<tr>
							<th>조회수</th>
							<td>${boardDetail.boardHit}</td>
						</tr>
						<tr>
							<th>첨부파일</th>
							<td></td>
						</tr>
					</table>
					
					<div class="boardContent">
						<div>${boardDetail.boardContent}</div>
					</div>
				</div>
				
				<!-- 댓글 -->
					<div class="cmtContainer">
						<p>댓글</p>
						<div>
							<textarea id="cmtBox"></textarea>
						</div>
						
						<!-- 댓글 리스트 -->
						<div>
							<span id="cmtWrite">작성자</span><span id="cmtDate">2023-01-24</span>
							<div id="cmtContent">댓글내용</div>
						</div>
					</div>
	</main>
</section>
<%@ include file="/WEB-INF/views/include/footer.jsp" %>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script src="../../api/ckeditor"></script>
<script src="../../js/board/boardDetail.js"></script>
</body>
</html>