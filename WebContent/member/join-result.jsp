<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%

	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String pass = request.getParameter("pass");
	String ssn = request.getParameter("ssn");
	String year = "";
	String month = "";
	String day = "";
	
	String bmi = "";
	String hi = request.getParameter("hi");
	double hi1 = Double.parseDouble(hi)* 0.01;
	String wi = request.getParameter("wi");
	double wi1 = Double.parseDouble(wi);
	double bmi2 = wi1 / (hi1*hi1); 
	if(40<bmi2){
		bmi = "고도비만";
	}else if(35<bmi2){
		bmi = "중등도 비만";
	}else if(30<bmi2){
		bmi = "경도 비만";
	}else if(25<bmi2){
		bmi = "과체중";
	}else if(18.5<bmi2){
		bmi = "정상";
	}else{
		bmi = "저체중";
	}
	
	//----------------------------------------------------------------
	String gender = "";
	String res =""; 
	char ch = res.charAt(7);
	switch (res) {
	case "1":
		gender = "남자";
		break;
	case "2":
		gender = "여자";
		break;
	case "3":
		gender = "남자";
		break;
	case "4":
		gender = "여자";
		break;
	case "5":
		gender = "외국인";
		break;
	case "6":
		gender = "외국인";
		break;
	}
	//----------------------------------------------------------------
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>가입한 ID:<%=id%></h3><br />
	<h3>이름 :<%=name%></h3><br />
	<h3>가입한 비번 :********</h3><br />
	<h3>생년월일<%=year%>년<%=month%>월<%=	%>일생</h3><br />
	<h3>성별 :<%=gender%></h3><br />
	<h3>BMI :<%=bmi%></h3><br />
	<a href="">로그인 이동</a><br />
	<a href="">홈으로 이동</a><br />


</body>
</html>