package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Page1Servlet")
public class Page1Servlet  extends HttpServlet{
	//HttpServletRequest  瀏覽器讀取瀏覽器傳送的訊息
	//HttpServletResponse 輸出到瀏覽器
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession(false);
		String[] items = req.getParameterValues("item");
		
		//session.setAttribute("item1", "java");
		System.out.println(session);
		if (session!= null) session.invalidate();
	}
}
