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
		
		if (count == null || line == null) {
			return;
		}
		
		out.print("<HTML>");		
		out.print("<BODY>");
		try {
			 int countInt = Integer.parseInt(count);
			  int lineInt =  Integer.parseInt(line);
			  out.print("<p>");
				for (int i =1;i<=countInt;i++) {				
					out.print(i+" ");
					if (i % lineInt  == 0) {
						out.print("<br/>");
					}						
				}
		}catch(Exception ex) {
			System.out.println("showPage ex:"+ex);
		}
		 
			out.print("</p>");
		out.print("</BODY>");
		out.print("</HTML>");
		
	}

}
