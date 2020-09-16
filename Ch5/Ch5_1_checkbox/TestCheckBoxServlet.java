package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/TestCheckBoxServlet")
public class TestCheckBoxServlet extends HttpServlet{
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out =   resp.getWriter();
		out.println("TestCheckBoxServlet!!");
		
		 String[] skills =  req.getParameterValues("skill");
		//String skillType = req.getParameter("skill");
		 
		 Map<String,String[]> map = req.getParameterMap();		 
		 map.forEach(
				 (k,v)->{
					 System.out.print(k+":");
					 for (String value : v) {
						 System.out.print(value+" ");
					 }
				 });
		 
		 for (String v : skills) {
			 out.println("skillType:"+v);
		 }
		
	}
}
