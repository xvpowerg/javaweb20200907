# HttpServlet 說明與建立步驟
# HttpServletRequest
只要跟容器相關的
1. 取得容器資源
2. 轉換Servlet
3. 取得Parameter
4. 取得Session
# HttpServletResponse
跟瀏覽器相關的
1. 輸出畫面
2. 輸出語系相關
3. 建立Cookie
4. 頁面轉換

# GET
| 優點        | 缺點   |  適合情境  |
| --------   | -----:  | :----:  |
| 快         | 安全性低   |  查詢  |
|  簡單      |  最大長度255字元   |  轉換頁面  |

# POST
| 優點        | 缺點   |   適合情境  |
| --------   | -----:     | :----:  |
| 比較安全     |      較慢    |  建立帳號 |
| 無最大長度限制  |  使用上複雜   |  登入  |


# 建立TestServlet 建立TestServlet
## 使用@WebServlet
1. 建立類別並加上pacakge
```java
package tw.com.web;
public class TestServlet {

}
````
2. 加入標籤並填入url-pattern
`注意url-pattern一定要加上/`
 ```java
 @WebServlet("/TestServlet")
public class TestServlet{
}
 ```
3. 類別要 extends HttpServlet
```java
public class TestServlet extends HttpServlet{

}
```
4 複寫doGet 或 doPost方法
```java
public class TestServlet extends HttpServlet{
 public void doGet(HttpServletRequest req,HttpServletResponse resp) {
	   
   }
}
```
