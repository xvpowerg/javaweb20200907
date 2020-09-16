# 測試Session
Session 是屬於瀏覽器範圍的Scop
## Session如何取得
可呼叫 getSession(create) boolean 參數 如果沒舊Ssession時才會有差異
* 沒舊Ssession 參數如果為false時 回傳null
* 沒舊Ssession 參數如果為true時 回傳一個HttpSession (新的HttpSession)
* 如果有舊session 則回傳舊Session
* 預設此參數為true
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
