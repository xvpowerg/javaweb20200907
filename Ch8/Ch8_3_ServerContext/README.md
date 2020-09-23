# ServletContext (Application)
## 範圍
在相同Webapp中都可讀到
## 用途
* 聊天室
* 廣播
## 使用方式
可透過 getServletContext() 取得 ServletContext
```java
public class TestServletContext extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	ServletContext application =   getServletContext();
	
	Integer count = (Integer)application.getAttribute("count");
	if (count == null) {
		count = 0;
	}
	count++;
	application.setAttribute("count", count);
		PrintWriter out =   resp.getWriter();
		out.println("count:"+count);
	}
}
```
## contextInitParameter
可針對ServletContext 建立InitParameter
* 宣告一組web.xml內容如下
```xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app version="3.1" xmlns="http://xmlns.jcp.org/xml/ns/javaee" 
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
         xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd">
         <context-param>
         		<param-name>db_account</param-name>
         		<param-value>qwer</param-value>
         </context-param>
         <context-param>
         	<param-name>db_pass</param-name>
         	<param-value>12345</param-value>
         </context-param>
</web-app>
```
一組context-param就是一組ServletContext的InitParameter
