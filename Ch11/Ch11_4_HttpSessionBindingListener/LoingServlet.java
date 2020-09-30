package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tw.com.bean.User;

@WebServlet("/LoingServlet")
public class LoingServlet  extends HttpServlet{
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			resp.setContentType("text/html;charset=UTF-8");
			String account  = req.getParameter("account");
			String logout  = req.getParameter("logout");
			User user = new User();
			user.setUserName(account);
			
			HttpSession session = req.getSession();
			if (session.getAttribute("account") == null) {
				session.setAttribute("account", user);
				resp.getWriter().println("account:"+account);
			}else if(logout != null) {
				session.removeAttribute("account");
				resp.getWriter().println("已登出");
			}
			
		}
}
