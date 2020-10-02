package tw.com.filter;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
@WebFilter("/*")
public class TestFilter implements Filter {
	private Set<String> set = new HashSet<>();
	//可以做Filter的初始化
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		set.add("/Page1Servlet");
		set.add("/Page3Servlet");
	}

	@Override
	public void doFilter(ServletRequest req,
				ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("TestFilter doFilter!!");
		 HttpServletRequest httpRreq = (HttpServletRequest)req;
		 String path = httpRreq.getServletPath();
		 System.out.println("path:"+path);
		 if (set.contains(path)) {
			 //過濾條件不成立return;
			 chain.doFilter(req, resp);//可以控制是否繼續往頁面走 
		 }
		
		
	}

}
