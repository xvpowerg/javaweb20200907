# Servlet生命週期
## 生命週期流程如下
* 由客戶端瀏覽器發送HTTP協定訊號，指定要運行的Url
* 容器收到後會察看是否有 對應的Url的檔案可執行
* 如果沒有找到會拋出404的錯誤
* 如果找到的是Servlet  會先看看此Servlet是否已有實體(已經有物件了) 
* 如果沒有實體 容器會將Servlet 建立實體  建立完畢後會呼叫init()
* 如果已有實體或建立了新實體 ，會開啟一組新的執行序，
執行此Servlet物件的service方法，並將HttpServletRequest與HttpServletResponse傳於此方法
					