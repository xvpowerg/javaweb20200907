<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%  List<String> list =
		(List) session.getAttribute("imageList");
	if (list!= null){
	for (String image : list){			
	%>		
	<img src="images/<%=image%>"/>
	  <%} %>  	
	<%} %>
</body>
</html>
