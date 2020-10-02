package tw.com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/Page2Servlet")
public class TestPage2Filter implements Filter {

	@Override
	public void doFilter(ServletRequest request,
			ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("TestPage2Filter in....");
		request.setAttribute("msg", "TestPage2Filter!!!");
		chain.doFilter(request, response);
		System.out.println("TestPage2Filter out....");
	}

}
