# Jsp初探
## Jsp常用標籤
```jsp
<%　可以寫java程式碼的區塊  %>
<%= %> 可輸出 Java數值 >
<% for(int i=1;i<=10;i++){%>
			<p><%=i %>  </p>
		<% }%>
```
`Jsp會被翻譯成一組繼承了JspServlet的class` 