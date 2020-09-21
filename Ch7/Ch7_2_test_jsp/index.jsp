<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
<!-- <　%　可以寫java程式碼的區塊  %>-->
<!--  < %= %> 可輸出 Java數值 -->
		<% for(int i=1;i<=10;i++){%>
			<p><%=i %>  </p>
		<% }%>
</body>
</html>