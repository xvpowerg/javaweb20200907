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
	<p>value:<%=++value %>
	<%pageContext.setAttribute("age", 35);%>
	<%=pageContext.getAttribute("age")%>
	<%=pageContext.getAttribute("price", pageContext.SESSION_SCOPE)%>
	<!--findAttribute 依照以下順序去找   Attribute page request session application-->
	<%=pageContext.findAttribute("title")%>	</p>
</body>
</html>