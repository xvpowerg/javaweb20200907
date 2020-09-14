package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ErrorPageServlet")
public class ErrorPageServlet extends HttpServlet {
	//只需要覆寫doPost就好 因為此頁面是由LoginServlet的doPost方法轉過來的
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			resp.setContentType("text/html;charset=UTF-8");	//可顯示中文 要在PrintWriter 之前呼叫
			PrintWriter out =  resp.getWriter();
			String msg = (String)req.getAttribute("msg");
			out.println("ErrorPageServlet!!"+msg);
		}
}
