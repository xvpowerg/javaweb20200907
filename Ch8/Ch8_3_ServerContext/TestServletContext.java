package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/TestServletContext")
public class TestServletContext extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	ServletContext application =   getServletContext();
	
	Integer count = (Integer)application.getAttribute("count");
	if (count == null) {
		count = 0;
	}
	count++;
	application.setAttribute("count", count);
		PrintWriter out =   resp.getWriter();
		out.println("count:"+count);
	}
}
