<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div id="content">
<%
String compo = request.getAttribute("compo")+"";
switch(compo){
case "login-success" :
	%>
	<%@ include file="login-success.jsp" %>
	<%
	break;
}
%>
</div>