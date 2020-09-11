package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/TestGetExercise")
public class TestGetExercise  extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
			
		PrintWriter out =  resp.getWriter();
		String count = req.getParameter("count");
		String line = req.getParameter("line");
		out.print("<HTML>");
		
		
		out.print("<BODY>");
		  int countInt = Integer.parseInt(count);
		  out.print("<p>");
			for (int i =1;i<=countInt;i++) {
				
				out.print(i);	
				out.print("<br/>");				
			}
			out.print("</p>");
			
		
		out.print("</BODY>");
		
		out.print("</HTML>");
		
	}

}
