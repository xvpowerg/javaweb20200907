package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ShowMsgServlet")
public class ShowMsgServlet  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=UTF-8");
		//HttpServletRequest取得的訊息 要使用UTF-8的編碼
		req.setCharacterEncoding("UTF-8");
		
	PrintWriter out = resp.getWriter();
		ServletContext app=  getServletContext();
		 String msg = (String)app.getAttribute("msg");
		 if (msg == null) {
			 out.println("尚未收到訊息");
		 }else {
			 out.println(msg);
		 }
	}
}
