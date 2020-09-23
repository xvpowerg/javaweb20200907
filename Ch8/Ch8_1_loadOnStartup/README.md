
# LoadOnStartup
有時Servlet 初始化時間較久，會影響使用者體驗，這時可讓須初始化的Servlet在容器運作時就初始化，可如下配置
```java
@WebServlet(urlPatterns = {"/Test1Servlet"},loadOnStartup = 0)
public class Test1Servlet extends HttpServlet {
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Test1Servlet init.....Start");
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Test1Servlet init.....End");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub		
		resp.getWriter().println("Test1Servlet");
	}
}
```
