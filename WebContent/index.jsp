<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인</h1>
	<div>
		<form action="member.do">
		ID <input type="text" name="id" /><br />
		PASS <input type="text" name= "pass" /><br />
		<input type="submit" id="btn" value = "로그인" />
		</form>
	</div>
	<a href="member/main.jsp">회원관리</a>
	<a href="">계좌관리</a>
	<a href="">게시판</a>
	<a href="">관리자</a>
</body>
</html>