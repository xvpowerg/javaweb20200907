# 測試Session
Session 是屬於瀏覽器範圍的Scop
## Session如何取得
可呼叫 getSession(create) boolean 參數 如果沒舊Ssession時才會有差異
* 參數如果為false 則回傳null
* 參數如果為true 則回傳一個HttpSession (新的HttpSession)
* 如果有舊session 則回傳舊Session
* 預設為true
## Session範例
```java
		HttpSession session = req.getSession();
		int count =0;		
		//當session.getAttribute("count") != null 時表示有count數值存在於Session
		if (session.getAttribute("count") != null) {
			 count = (Integer)session.getAttribute("count");
		}		
		count++;
		session.setAttribute("count", count);
	     PrintWriter out = resp.getWriter();
	     out.println(count);
		

```
