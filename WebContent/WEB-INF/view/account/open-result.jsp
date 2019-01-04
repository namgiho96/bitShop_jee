<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="<%=application.getContextPath()%>/resources/css/style.css"/>
<body>
</head>
<body>
<table id="wrapper">
	<tr>
		<td colspan="2">
			<h1>계좌관리</h1>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<div id="navi-bar">
                    <ul>
                        <li><a href="home.do">홈</a></li>
                        <li><a href="member.do">회원관리</a>
                        <li ><a href="account.do" style = "background-color: green">계좌관리</a></li>
                        <li><a href="article.do">게시판</a>
                        <li><a href="admin.do">관리자</a>
                    </ul>
                </div>
			</td>
		</tr>
	<tr  style="height: 600px">
		<td id="side-menu">
			<table>
				<tr>
					<td>계좌개설</td>
				</tr>
				<tr>
					<td>계좌목록</td>
				</tr>
				<tr>
					<td>계좌검색(이름)</td>
				</tr>
				<tr>
					<td>계좌검색(계좌번호)</td>
				</tr>
				<tr>
					<td>총계좌수</td>
				</tr>
				<tr>
					<td>계좌번호체크</td>
				</tr>
				<tr>
					<td>입금</td>
				</tr>
				<tr>
					<td>출금</td>
				</tr>
				<tr>
					<td>계좌삭제</td>
					
				</tr>
			</table>
		</td>
		<td>
			성공적으로 개설 되었습니다<br />
 			계좌번호 : <br />
 			잔액 :	<br />
		</td>
	</tr>
</table>
</body>
</html>
 
</body>
</html>