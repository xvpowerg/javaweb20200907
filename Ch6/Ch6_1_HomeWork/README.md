# 檢討作業
------------------------------
有三頁面
1. 可勾選三個產品 java 800 python 700 Golan 650
2. 顯示剛選擇的產品 並且可輸入數量
3. 計算單筆金額 與總金額
## 為什麼容器會記得session 內的Attribute 
因為瀏覽器記得 JSESSIONID
## JSESSIONID
1. 第一次使用Request申請Session時,容器會產生一組新的JSESSIONID，並透過Response傳遞給瀏覽器
2. 如果瀏覽器的Cookie 是開啟的 下次Request 就會將JSESSIONID 帶回給 容器，容器就可使用此ID取得Attribute 
3. 注意如果容器產生了Session但是瀏覽器忘了JSESSIONID ，Session還是會存於容器，等過了一陣子才會被GC
4. 要讓容器Session 最快消失的方式 是呼叫invalidate()
## 進一步思考 HttpServletRequest 與 HttpServletResponse
* HttpServletRequest  是讀取客戶端來得資訊作分析
* HttpServletResponse 是寫出回傳給瀏覽器做顯示

