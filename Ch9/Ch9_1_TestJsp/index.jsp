<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 只做顯示 -->

<!--  -->	
<%!
int value = 0;
%>

	<%="產品1" %> 
	<%=session.getAttribute("price") %>
	<%=application.getAttribute("title") %>
	<p>value:<%=++value %></p>
</body>
</html>