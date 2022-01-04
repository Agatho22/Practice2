<%@page import="javax.security.auth.message.callback.PrivateKeyCallback.Request"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
%>
	<h1>사칙연산 결과</h1>
	<%=num1 %> + <%=num2 %> = <%= num1 + num2 %> <br>
	<%=num1 %> - <%=num2 %> = <%= num1 - num2 %> <br>
	<%=num1 %> * <%=num2 %> = <%= num1 * num2 %> <br>
	<%=num1 %> / <%=num2 %> = <%= num1 / num2 %> <br>
</body>
</html>