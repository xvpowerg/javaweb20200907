# 測試Session
Session 是屬於瀏覽器範圍的Scop
可用範圍:
購物車
登入
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
## 作業
有三頁面
1. 可勾選三個產品  java 800 python 700  Golan 650
2. 顯示剛選擇的產品 並且可輸入數量
3. 幫我計算單筆金額 與總金額

