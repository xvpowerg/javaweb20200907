# Cookie
## Cookie 特性
1. 可保存在瀏覽器端
2. 只能存放文字
3. 是一種nmae 與 value的結構
4. 最多只能存放4KB
## 可使用 HttpServletRequest 取的已存在的Cookies 如果不存在回傳null
因為Cookies是以字串樣式存放在瀏覽器中，當瀏覽器送HTML給容器時會一併傳送Cookie字串，這時容器只要讀取即可

## 可使用 HttpServletResponse 建立新的Cookies 
由容器發送訊息給瀏覽器建立新的Cookie

```java
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//HttpServletRequest 取的已存在的Cookies 如果不存在回傳null    
		Cookie[]  cookieArray = req.getCookies();
    //建立新的Cookie
		Cookie cookie = new Cookie("myName","Howard");
		resp.addCookie(cookie);
			for (Cookie c : cookieArray) {
				System.out.println(c);
			}	
	}
```
