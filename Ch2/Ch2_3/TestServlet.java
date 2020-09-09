package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet{
	//預設情況下都是doGet
   public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException {
	   PrintWriter out = resp.getWriter();
	   out.print("<HTML>");
	   out.print("<BODY>");
	   for (int i =1;i<=5;i++) {
		   out.print("Howard");
		   out.print("<br/>");
	   }		
		   out.print("Ken");
	   out.print("</BODY>");
	   out.print("</HTML>");
	   
   }
}
