# 使用Post與使用Get做登入差異
我們使用Chrome工具查看發現
+ 使用Get傳送是使用 Query String parameters 傳送 會顯示在瀏覽器上
+ 使用Post傳送是使用 Form Data 傳送 不會顯示在瀏覽器上 所以相對安全
+ 以上資料都可在HTML傳送的Headers找到
