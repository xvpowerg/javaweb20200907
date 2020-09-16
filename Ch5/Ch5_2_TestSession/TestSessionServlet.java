package tw.com.web;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/TestSessionServlet")
public class TestSessionServlet extends HttpServlet{
	//在Servlet 請最好不要宣告　可變動的屬性
	//private int count = 0;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//getSession(create) boolean 參數 如果沒舊Ssession時才會有差異
		//參數如果為false 則回傳null
		//參數如果為true 則回傳一個HttpSession (新的HttpSession)
		//如果有舊session 則回傳舊Session
		//預設為true
		HttpSession session = req.getSession();
		int count =0;		
		//當session.getAttribute("count") != null 時表示有count數值存在於Session
		if (session.getAttribute("count") != null) {
			 count = (Integer)session.getAttribute("count");
		}		
		count++;
		session.setAttribute("count", count);
	     PrintWriter out = resp.getWriter();
	     out.println(count);
		
	}
}
