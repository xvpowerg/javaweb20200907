package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestCookieServlet")
public class TestCookieServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//HttpServletRequest �����w�s�b��Cookies �p�G���s�b�^��null
		Cookie[]  cookieArray = req.getCookies();
		Cookie cookie = new Cookie("myName","Howard");
		resp.addCookie(cookie);
			for (Cookie c : cookieArray) {
				System.out.println(c);
			}	
		
		
		
	}
}
