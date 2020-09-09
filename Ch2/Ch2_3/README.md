# 建立TestServlet 建立TestServlet
## 使用@WebServlet
1. 建立類別並加上pacakge
```java
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
