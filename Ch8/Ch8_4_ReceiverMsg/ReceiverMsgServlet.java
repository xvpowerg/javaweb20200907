package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ReceiverMsgServlet")
public class ReceiverMsgServlet extends HttpServlet  {
	//前端由post傳一文字訊息給此Servlet
	//希望可以顯示給所有在此WebApp的人看到
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=UTF-8");
		//HttpServletRequest取得的訊息 要使用UTF-8的編碼
		req.setCharacterEncoding("UTF-8");
		PrintWriter out=  resp.getWriter();
		String msg = req.getParameter("msg");
		ServletContext application=getServletContext();
		application.setAttribute("msg", msg);
		out.println(msg+"訊息發送成功!");
		
	}
	
}
