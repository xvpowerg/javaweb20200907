package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	private String account = "qwer";
	private String password = "12345";
//		@Override
//		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {				
//			
//			
//		}
		
	
	
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

			resp.setContentType("text/html;charset=UTF-8");	//可顯示中文 要在PrintWriter 之前呼叫
			PrintWriter out =  resp.getWriter();
			 out.println("doPost!!!");	
			String acc =  req.getParameter("account");
			String pass = req.getParameter("password");
			
			if (acc.equals(account) && pass.equals(password)) {
				 out.println("登入成功");	
			}else {
				 out.println("登入失敗");
				 //交付給其他Servlet做事 不會變化網址				
				 req.getRequestDispatcher("/ErrorPageServlet").forward(req, resp);
			}
		}
}
