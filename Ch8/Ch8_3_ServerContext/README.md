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
