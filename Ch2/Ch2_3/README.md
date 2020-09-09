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
