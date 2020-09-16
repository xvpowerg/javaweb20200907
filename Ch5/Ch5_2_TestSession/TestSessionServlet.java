package tw.com.web;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestSessionServlet")
public class TestSessionServlet extends HttpServlet{
	//在Servlet 請最好不要宣告　可變動的屬性
	//private int count = 0;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int count = 0;
		count++;
     PrintWriter out = resp.getWriter();
     out.println(count);
		
	}
}
