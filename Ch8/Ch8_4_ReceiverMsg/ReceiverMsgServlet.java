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
	//�e�ݥ�post�Ǥ@��r�T������Servlet
	//�Ʊ�i�H��ܵ��Ҧ��b��WebApp���H�ݨ�
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=UTF-8");
		//HttpServletRequest���o���T�� �n�ϥ�UTF-8���s�X
		req.setCharacterEncoding("UTF-8");
		PrintWriter out=  resp.getWriter();
		String msg = req.getParameter("msg");
		ServletContext application=getServletContext();
		application.setAttribute("msg", msg);
		out.println(msg+"�T���o�e���\!");
		
	}
	
}
