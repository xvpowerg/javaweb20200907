# checkBox 傳參數
## 有一組HTML如下:
```html
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
	<form action="TestCheckBoxServlet" method="post">
		<input type="checkbox" name="skill" value="0"/>Java
		<input type="checkbox" name="skill" value="1"/>Python
		<input type="checkbox" name="skill" value="2"/>Golang
		<input type="checkbox" name="skill" value="3"/>JavaScript
		<button>確定</button>
	</form>
</body>
</html>
```

## TestCheckBoxServlet如下
因為checkbox名稱相同,注意取得checkbox所選value時`必須使用HttpServletRequest物件下的getParameterValues方法`
```java
@WebServlet("/TestCheckBoxServlet")
public class TestCheckBoxServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out =   resp.getWriter();
		out.println("TestCheckBoxServlet!!");
		 String[] skills =  req.getParameterValues("skill");
		//String skillType = req.getParameter("skill");
		 for (String v : skills) {
			 out.println("skillType:"+v);
		 }
		
	}
}

```
# HttpServletRequest getParameterMap()  主要用來顯示所有選取的key 與 value 除bug用
此方法會回傳Map<String,String[]>, String 為form的name String[]為所選的數值的value
案例如下:假設選了0 2 3 
```java
		 Map<String,String[]> map = req.getParameterMap();		 
		 map.forEach(
				 (k,v)->{
					 System.out.print(k+":");
					 for (String value : v) {
						 System.out.print(value+" "); //輸出skill:0 2 3 
					 }
				 });
```
