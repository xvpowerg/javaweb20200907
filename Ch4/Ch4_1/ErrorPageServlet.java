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
	//�u�ݭn�мgdoPost�N�n �]���������O��LoginServlet��doPost��k��L�Ӫ�
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			resp.setContentType("text/html;charset=UTF-8");	//�i��ܤ��� �n�bPrintWriter ���e�I�s
			PrintWriter out =  resp.getWriter();
			out.println("ErrorPageServlet!!");
		}
}
