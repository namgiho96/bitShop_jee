<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="domain.*" %>
     <%
    	AccountBean acc = (AccountBean)request.getAttribute("acc");
    %>

<div id="open-result">
	성공적으로 개설 되었습니다<br />
	계좌번호<%= acc%> <br/>
</div>
