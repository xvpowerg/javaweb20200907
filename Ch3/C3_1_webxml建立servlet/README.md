# Webxml建立servlet
1. 建立一個類別 並且繼承HttpServlet 如下 且覆寫doGet
```java
public class TestWebxmlServlet extends HttpServlet{
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
				throws ServletException, IOException {
		    PrintWriter out =   resp.getWriter();
		    out.println("Hello!! TestWebxmlServlet");
		}
	
}
```
2. 將web.xml放置於
+ WebContent
    + WEB-INF
3. Web.xml新增TestWebxmlServlet如下
注意 servlet-name與servlet-class 不可對調
```XML
<?xml version="1.0" encoding="UTF-8"?>
<web-app version="3.1" xmlns="http://xmlns.jcp.org/xml/ns/javaee" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd">
      <servlet>      
	     
      	  <servlet-name>TestWebxml</servlet-name>
           <servlet-class>tw.com.web.TestWebxmlServlet</servlet-class>
      </servlet>
     
</web-app>


```
