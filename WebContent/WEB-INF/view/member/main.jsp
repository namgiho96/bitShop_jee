<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<link rel="stylesheet" href="<%= application.getContextPath()%>/resources/css/style.css"/>
<body>
	<table id="wrapper">
		<tr>
			<td colspan="2">
				<%@ include file="../home/header.jsp"%>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<div id="navi-bar">
					<ul>
						<li><a href="home.do">홈</a></li>
						<li><a href="member.do" style="background-color: green">회원관리</a></li>
						<li><a href="account.do">계좌관리</a></li>
						<li><a href="article.do">게시판</a>
						<li><a href="admin.do">관리자</a>
					</ul>
				</div>
			</td>
		</tr>
		<tr style="height: 600px">
			<td id="side-menu">
				<table>
					<tr>
						<td>회원가입</td>
					</tr>
					<tr>
						<td>회원목록</td>
					</tr>
					<tr>
						<td>이름으로 찾기</td>
					</tr>
					<tr>
						<td>아이디 찾기</td>
					</tr>
					<tr>
						<td>회원수</td>
					</tr>
					<tr>
						<td>로그인</td>
					</tr>
					<tr>
						<td>비번수정</td>
					</tr>
					<tr>
						<td>아이디 삭제</td>
					</tr>
				</table>
			</td>
			<td></td>
		</tr>
	</table>
</body>
</html>