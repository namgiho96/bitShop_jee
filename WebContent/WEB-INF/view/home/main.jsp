<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- <%@ include file="head.jsp"%> --%>

<link rel="stylesheet" href="<%= application.getContextPath()%>/resources/css/style.css"/>
<body>
	<table id="wrapper">
		<tr>
			<td colspan="2">
				<%@ include file="header.jsp"%>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<%@ include file = "navi-bar.jsp" %>
			</td>
		</tr>
		<tr style="height: 600px">
			<td style="width: 30%">
				<%@ include file="side-menu.jsp" %>
			</td>
			<td>
				 
				 <%@ include file="welcome.jsp"%>
			</td>
		<tr style="height: 100%">
			<td colspan="2">
				<%@ include file="footer.jsp" %>
			</td>
		</tr>
	</table>
</body>
</html>