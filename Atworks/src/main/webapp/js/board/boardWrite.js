/**
 * 게시판 글쓰기
 */
 
let submitBtn = document.querySelector(".submitBtn");	// 작성완료 버튼 
let cancelBtn = document.querySelector(".cancelBtn");	// 취소 버튼



cancelBtn.addEventListener("click",function(e){
	if(confirm("작성을 취소하겠습니까?")==true){
		location.href=("/board/board");
	} else {
		e.preventDefault();
	}
});