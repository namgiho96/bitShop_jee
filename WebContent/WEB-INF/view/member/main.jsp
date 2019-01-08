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
				<%@ include file="../home/navi-bar.jsp" %>
			</td>
		</tr>
		<tr style="height: 600px">
			<td style="width: 30%">
			
			<%
			String dest = String.valueOf(request.getAttribute("dest"));
			if(dest.equals("join-form")){
				%>
				<%@ include file="side-menu.jsp"%>
				<% 
			}else{
				%>
				<%@ include file="side-join.jsp" %>
				<% 
				}
			%>
			<%-- 	<%@ include file="side-menu.jsp"%>--%>
			</td>
			<td> 
			<%
			dest = String.valueOf(request.getAttribute("dest"));
			switch(dest){
			case "NONE": case "mypage":
				%>
					<%@ include file="mypage.jsp"%>
				<% 
				break;
			case "join-form":
				%>
				 <%@ include file="join-form.jsp"%>
				<% 
				break;
			}	
			%>
			</td>
		</tr>
	</table>
</body>
</html>