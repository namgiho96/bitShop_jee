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
						<li><a href="member.do" id="current">회원관리</a></li>
						<li><a href="account.do">계좌관리</a></li>
						<li><a href="article.do">게시판</a>
							<ul>
								<li><a href="article.do">글쓰기</a></li>
								<li><a href="article.do">게시판 목록</a></li>
								<li><a href="article.do">게시판 수정</a></li>
							</ul></li>
						<li><a href="admin.do" style="background-color: green">관리자</a>
							<ul>
								<li><a href="admin.do">관리자 페이지</a></li>
							</ul></li>
					</ul>
				</div>
			</td>
		</tr>
		<tr style="height: 600px">
			<td id="side-menu">
				<table>
					<tr>
						<td>관리자 등록</td>
					</tr>
					<tr>
						<td>관리자 수</td>
					</tr>
					<tr>
						<td>관리자 이름으로 찾기</td>
					</tr>
					<tr>
						<td>관리자 아이디로 찾기</td>
					</tr>
					<tr>
						<td>관리자 로그인</td>
					</tr>
					<tr>
						<td>관리자 수정</td>
					</tr>
					<tr>
						<td>관리자 삭제</td>
					</tr>
				</table>
			</td>
			<td></td>
		</tr>
	</table>
</body>
</html>