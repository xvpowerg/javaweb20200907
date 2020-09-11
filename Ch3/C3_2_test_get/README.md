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
3. 執行專案後　點選　傳數字25會顯示`TestGetServlet!25`　
## 使用GET 做運算
1. 新增 TestGetServlet 程式碼 如下:
```java
@WebServlet("/TestGetServlet")
public class TestGetServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 PrintWriter out =  resp.getWriter();
		 //getParameter 會回傳字串
		 //HttpServletRequest 內的getParameter 取得參數
		 //如果無number參數 不顯示
		String number =  req.getParameter("number");
	
		 if(number != null) {
			 out.println("TestGetServlet!"+number);
		 }
		 //新增部分
		 String action =   req.getParameter("action");
		 String n1 =  req.getParameter("n1");
		 String n2 =  req.getParameter("n2");
		 
		 int ans = 0;
		 if (action!=null && n1 !=null && n2 != null) {
			 int intN1 = Integer.parseInt(n1);
			 int intN2 = Integer.parseInt(n2);
			 
			 switch(action) {
				 case "add":
					 ans = intN1 + intN2;
					 break;
			 }
			 out.println("TestGetServlet!"+ans);
		 }

	}
}
```
2. index.html新增如下
```html
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 注意不可以 加上/TestGetServlet -->
		<a href="TestGetServlet?number=25">傳數字25</a> <br/>
		<a href="TestGetServlet?action=add&n1=20&n2=30">20+30</a>		
</body>
</html>
```
## 可能的Bug
1. 如果getParameter 為null
2. Integer.parseInt 的參數不是數字
3. 沒有對應的action
解決方案如下程式碼:
```java
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 PrintWriter out =  resp.getWriter();
		 //getParameter 會回傳字串
		 //HttpServletRequest 內的getParameter 取得參數
		 //如果無number參數 不顯示
		String number =  req.getParameter("number");
		//解決null bug
		 if(number != null) {
			 out.println("TestGetServlet!"+number);
		 }
		 
		 String action =   req.getParameter("action");
		 String n1 =  req.getParameter("n1");
		 String n2 =  req.getParameter("n2");
		 
		 int ans = 0;
		 //解決null bug
		 if (action!=null && n1 !=null && n2 != null) {
			 try {
			 //解決Integer.parseInt 的參數不是數字 bug
			 //解決沒有對應的action bug
				 int intN1 = Integer.parseInt(n1);
				 int intN2 = Integer.parseInt(n2);
				 
				 switch(action) {
					 case "add":
						 ans = intN1 + intN2;
						 break;
					 default:
					    throw new IllegalArgumentException("action Error!");
						
				 }	 
			 }catch(Exception ex) {
				 System.out.println("action:"+ex);
			 }
			
			 out.println("TestGetServlet!"+ans);
		 }

	}
```

