# Servlet InitParameter
## 可以在web.xml設定專屬的初始化參數，設定方式如下
```xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app version="3.1" xmlns="http://xmlns.jcp.org/xml/ns/javaee" 
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
         xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd">
         <servlet>
         	<servlet-name>TestInitParamServlet</servlet-name>
         	<servlet-class>tw.com.web.TestInitParamServlet</servlet-class>
         	<init-param>
         		<param-name>path</param-name>
         		<param-value>C:\MyDir</param-value>
         	</init-param>
         	<init-param>         	
	         	<param-name>account</param-name>
	         	<param-value>qwer</param-value>
         	</init-param>
         </servlet>
</web-app>
```
## 在Servlet中可使用InitParameter 可呼叫getInitParameter("path"); 取得InitParameter，`注意Servlet的name要設定的跟web.xml有對應關係`案例如下
```java
@WebServlet(name="TestInitParamServlet",urlPatterns = {"/TestInitParamServlet"})
public class TestInitParamServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		out.println("TestInitParamServlet!!");
		 String path = getInitParameter("path");
		 System.out.println(path);
		 String account = getInitParameter("account");
		 System.out.println(account);	 
		 
	}
}

```
## 可在Servlet中設定InitParameter如下
* InitParameter的name如果跟web.xml重疊，web.xml為主
```java
@WebServlet(name="TestInitParamServlet",urlPatterns = {"/TestInitParamServlet"},
	initParams= {		
			@WebInitParam(name="color",value ="red"),
			@WebInitParam(name="weight",value ="20"),
			@WebInitParam(name="account",value ="zxcv")
})
public class TestInitParamServlet extends HttpServlet {
	........
}

```
