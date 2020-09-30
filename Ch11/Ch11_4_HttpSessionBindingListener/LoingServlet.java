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
				
			String account  = req.getParameter("account");
			User user = new User();
			user.setUserName(account);
			resp.getWriter().println("account:"+account);
			HttpSession session = req.getSession();
			session.setAttribute("account", user);
		}
}
