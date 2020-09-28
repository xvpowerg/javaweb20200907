package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/TestAsyncServlet")
public class TestAsyncServlet  extends HttpServlet{
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			resp.setContentType("text/html; charset=UTF8");
			PrintWriter out =  resp.getWriter();
			System.out.println("Submit Start!");
			out.println("開始!!");
			
			try {
				TimeUnit.SECONDS.sleep(10);	
			}catch(Exception ex) {}
			out.println("完成10秒任務");
			
		}
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		}
}
