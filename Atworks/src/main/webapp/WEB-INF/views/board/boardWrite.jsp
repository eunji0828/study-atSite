<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<title>게시판 글쓰기</title>
	<link rel="stylesheet" href="../../css/board/boardWrite.css">
</head>
<%@ include file="/WEB-INF/views/include/script.jsp" %>

<body>
<%@ include file="/WEB-INF/views/include/header.jsp" %>

<section class="main_wrap">
	<main class="main">
		<form action="/board/boardWrite" method="post">
				<div class="writeContainer">
					<div>글쓰기</div>
					<table>
						<tr>
							<th>제목</th>
							<td><input type="text" id="boardTitle" name="boardTitle" placeholder="제목을 입력하세요"></td>
						</tr>
						<tr>
							<th>작성자</th>
							<td>${userNick}
								<input type="hidden" name="userNo">
							</td>
						</tr>
						<tr>
							<th>첨부파일</th>
							<td><input type="file" name="boardFile"></td>
						</tr>
					</table>
				</div>
			
				<!-- ck에디터 -->
				<div class="boardWriteEditor">
					<textarea id="ckeditor" name="boardContent"></textarea>
					<script type="text/javascript">
					CKEDITOR.replace('ckeditor'
			                , {height: 500                                                  
			                 });
					</script>
				</div>
				
				<!-- 버튼 -->
				<div class="writeBtn">
					<input type="submit" value="작성 완료" class="boardBtn submitBtn">
					<input type="button" value="취소" class="boardBtn cancelBtn">
				</div>
		</form>
	
	</main>
</section>
<%@ include file="/WEB-INF/views/include/footer.jsp" %>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script src="../../api/ckeditor"></script>
<script src="../../js/board/boardWrite.js"></script>
</body>
</html>