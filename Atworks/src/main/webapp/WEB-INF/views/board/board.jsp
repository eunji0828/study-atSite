<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<title>게시판</title>
	<link rel="stylesheet" href="../../css/board/board.css">
</head>
<%@ include file="/WEB-INF/views/include/script.jsp" %>

<body>
<%@ include file="/WEB-INF/views/include/header.jsp" %>

<section class="main_wrap">
	<main class="main">
		<div class="container">
			<div class="boardContainer">
			<div>
				<select class="selectBox">
					<option value="">전체</option>
					<option value="title">제목</option>
					<option value="write">작성자</option>
				</select>
				<input type="text" placeholder="검색어를 입력하세요" id="boardSearch">
				<input type="button" value="검색" id="searchBtn">
			</div>
			<div>
				<input type="button" id="write" value="글쓰기">
			</div>
			</div>
			
			<table>
				<tr class="boardList">
					<th>번호</th>
					<th class="titleWidth">제목</th>
					<th>작성자</th>
					<th>작성일</th>
					<th>조회수</th>
					<th>좋아요</th>
				</tr>
				<c:forEach items="${boardList}" var="board">
					<tr class="font">
						<td>${board.boardNo}</td>
						<td class="titleWidth"><a href="/board/boardDetail?boardNo=${board.boardNo}">${board.boardTitle}</a></td>
						<td>${board.userNick}</td>
						<td>${board.boardDate}</td>
						<td>${board.boardHit}</td>
						<td>${board.boardLike}</td>
					</tr>
				</c:forEach>
			</table>
			
			<!-- 페이징 -->
			<div class="paginationContainer">
				<ul class="pagination">
					<!-- 이전 버튼 -->
					<c:if test="${pageMaker.prev}">
						<li>
							<a href='<c:url value="/board/board?page=${pageMaker.startPage-1}"/>'>prev</a>
						</li>					
					</c:if>
					
					<!-- 현재 페이지 -->
					<c:forEach begin="${pageMaker.startPage}" end="${pageMaker.endPage}" var="pageNum">
						<li>
							<a href='<c:url value="/board/board?page=${pageNum}"/>'>${pageNum}</a>
						</li>
					</c:forEach>
					
					<!-- 다음 버튼 -->
					<c:if test="${pageMaker.next && pageMaker.endPage > 0}">
						<li>
							<a href='<c:url value="/board/board?page=${pageMaker.endPage+1}"/>'>next</a>
						</li>
					</c:if>
				</ul>
			</div>
		</div>
	</main>
</section>
<%@ include file="/WEB-INF/views/include/footer.jsp" %>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script src="../../js/board/board.js"></script>
</body>
</html>