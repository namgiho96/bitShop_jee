<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String name = request.getAttribute("name")+"";
if(name.equals("남기호")){
	%>
	<%=name %> 님 환영합니다.
	<%
}
%>
    