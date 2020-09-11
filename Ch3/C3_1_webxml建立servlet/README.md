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