package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

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
			List<String> msgList = new ArrayList<>();
			
			if (!account.equals(acc)) {
				msgList.add("帳號錯誤");
			}
			if (!password.equals(pass)) {
				msgList.add("密碼錯誤");
			}
			if (msgList.size() == 0) {
				 out.println("登入成功");	
			}else {				
				 out.println("登入失敗");
				 //交付給其他Servlet做事 不會變化網址
				 //可透過HttpServletRequest傳遞參數給下一個Servelt
				 //Request傳遞特性是一個Servlet傳給另一個Servlet
				 //作業 帳號錯誤 密碼錯誤 幫我在ErrorPageServlet 做顯示
				 //setAttribute(key,value)
				 req.setAttribute("msg", "登入失敗!");
				 req.setAttribute("msgList", msgList);
				 req.getRequestDispatcher("/ErrorPageServlet").forward(req, resp);
			}
		}
}
