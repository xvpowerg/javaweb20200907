package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TestCookiesServlet")
public class TestCookiesServlet  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out= resp.getWriter();
		String account = req.getParameter("account");
	    int count = 0;		
		Cookie[] cookieArray =  req.getCookies();
		System.out.println(cookieArray);
		if (cookieArray != null) {
			for (Cookie cookie : cookieArray) {				
				if (cookie.getName().equals(account)) {
					count =Integer.parseInt(cookie.getValue());
				}				
			}	
		}
		count++;
		Cookie cookie = new Cookie(account,String.valueOf(count));
		resp.addCookie(cookie);
		
		out.print(account+":"+count);
				
	}
}
