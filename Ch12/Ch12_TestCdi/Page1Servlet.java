package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Page1Servlet")
public class Page1Servlet  extends HttpServlet{
	
	private Product p1 = new Book();
			@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				p1.setName("Android");
				p1.setPrice(20);
				System.out.println(p1);				
	}
}
