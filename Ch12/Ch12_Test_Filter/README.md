# Filter
可以判定是否要顯示頁面
* 必須覆寫public void doFilter(ServletRequest req,
				ServletResponse resp, FilterChain chain)
* 可由是否呼叫chain.doFilter(req, resp) 控制是否繼續顯示頁面  
* 可複寫public void init(FilterConfig filterConfig) 初始化Filter參數
