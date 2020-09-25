# JSP
JSP常用標記
```jsp
<%-- 
我是JSP註解
--%>

<!--我是HTML註解

Scriptlet 元素
<%    %> 等同於程式寫在Servelt的doGet doPost
Expression 元素
<%=要輸出的元件%> 專門顯示

Declaration 元素
<%!  %> 宣告放在類別層級元素
Directive 指示元素 <%@page  %>
```
## page contentType
1 .指定 網頁編碼 
 <%@page contentType="text/html" pageEncoding="UTF-8"%>
## page import
2  import  <%@page import="java.util.ArrayList"%> 


## 隱含物件
* out   //JspWriter 等同於 PrintWriter
* request 等同於 HttpServletRequest
* response 等同於 HttpServletResponse
* config  等同於 ServletConfig
* application 等同於 ServletContext
* session 等同於HttpSession
* pageContext 等同於 PageContext

