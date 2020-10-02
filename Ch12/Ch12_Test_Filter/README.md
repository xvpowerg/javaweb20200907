# Filter
可以判定是否要顯示頁面
* 必須覆寫public void doFilter(ServletRequest req,
				ServletResponse resp, FilterChain chain)
* 可由是否呼叫chain.doFilter(req, resp) 控制是否繼續顯示頁面  
* 可複寫public void init(FilterConfig filterConfig) 初始化Filter參數
## 如需要定義順序必須使用web.xml
以下會先執行a1filter 在執行 a2filter
```xml

<?xml version="1.0" encoding="UTF-8"?>
	<filter>
		 <filter-name>a1filter</filter-name>
		<filter-class>tw.com.filter.TestFilter</filter-class>		
	</filter>
	<filter>
		 <filter-name>a2filter</filter-name>
		<filter-class>tw.com.filter.TestPage2Filter</filter-class>		
	</filter>
	
	<filter-mapping>
	    <filter-name>a1filter</filter-name>
	    <url-pattern >/*</url-pattern>
	</filter-mapping>
	<filter-mapping>
	    <filter-name>a2filter</filter-name>
	    <url-pattern >/Page2Servlet</url-pattern>
	</filter-mapping>
</web-app>



```
