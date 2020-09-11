# 測試GET 

## 使用GET取值
1. 新增 TestGetServlet 如下
```java
@WebServlet("/TestGetServlet")
public class TestGetServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 PrintWriter out =  resp.getWriter();
		 //getParameter 會回傳字串
		 //HttpServletRequest 內的getParameter 取得參數
		String number =  req.getParameter("number");
		 out.println("TestGetServlet!"+number);
	}
}
```
2.新增 index.html 於WebContent目錄
```index.html 表示首頁，大部分網站伺服器都會自動執行index.html ```
```html
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 注意不可以 加上/TestGetServlet -->
		<a href="TestGetServlet?number=25">傳數字25</a>
</body>
</html>
```
## 使用GET取值
