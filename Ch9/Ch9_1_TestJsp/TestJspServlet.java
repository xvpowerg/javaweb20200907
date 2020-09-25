package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/TestJspServlet")
public class TestJspServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  HttpSession mySession=	req.getSession();
	  mySession.setAttribute("price",50);
	 ServletContext app=   getServletContext();
	 app.setAttribute("title", "¥þ¥ÁPK!");
	}
}
