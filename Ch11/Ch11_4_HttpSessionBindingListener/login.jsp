<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="LoingServlet">
		<% if (session.getAttribute("account")== null){ %>
		<input type="text" name="account" /> <button>登入</button>
		<%}else{ %>
		<input type="hidden" name="logout" value=""/>
		<button>登出</button>
		<% }%>
	</form>
</body>
</html>
