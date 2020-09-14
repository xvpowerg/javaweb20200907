# 使用Post,Get做登入差異 與顯示中文
## 大部分的case開發的順序
+ index.html 
+ css 
+ javascript
+ 開始開發後端
+ Servlet 接收前端的資訊
+ Servlet 回應對應的畫面

 


我們使用Chrome工具查看發現
+ 使用Get傳送是使用 Query String parameters 傳送 會顯示在瀏覽器上
+ 使用Post傳送是使用 Form Data 傳送 不會顯示在瀏覽器上 所以相對安全
+ 以上資料都可在HTML傳送的Headers找到
# 顯示中文
可呼叫HttpServletResponse物件的setContentType方法
`注意要在PrintWriter 之前呼叫如下`
```java
resp.setContentType("text/html;charset=UTF-8");	//可顯示中文 要在PrintWriter 之前呼叫
			PrintWriter out =  resp.getWriter();
			 out.println("拉拉拉");	
```

# 想將Servlet內容交付給其他Servlet
請使用 HttpServletRequest物件的 getRequestDispatcher方法如下 `注意網址列不會變化`

```java
 req.getRequestDispatcher("/ErrorPageServlet").forward(req, resp);
```


