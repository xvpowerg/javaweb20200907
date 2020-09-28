# 測試非同步
使用非同步可開啟自定義執行序，好處是更快釋放容器的執行序，使更多用戶可連上容器
* 要開啟非同步必須將asyncSupported 設為 true
```java
@WebServlet(urlPatterns = {"/TestAsyncServlet"},
asyncSupported = true)
public class TestAsyncServlet  extends HttpServlet{
```
* 呼叫req.startAsync(); 取得 AsyncContext 作為日後執行序控制的工具

* 可透過AsyncContext取得Request與Response 完成後記得呼叫complete()
```java
				try {
					PrintWriter out = ctx.getResponse().getWriter();
					out.println("開始!!");				
					TimeUnit.SECONDS.sleep(10);	
					out.println("完成10秒任務");
					ctx.complete();
				}catch(Exception ex) {
					
				}
				
```
# AJAX 是Asynchronous JavaScript and XML 縮寫
* 可透過JavaScript 在瀏覽器開啟新的執行序發送Request與接收response
```java
fetch('TestAsyncServlet',{method:'get'})
```
