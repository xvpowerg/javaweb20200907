package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Init!!!");
	}
	
//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println("service!!!!");
//		
//	}
//	
	@Override
	protected void doGet(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println("doGet !!!");
		//1 �ѫȤ���s�����o�eHTTP��w�T���A���w�n�B�檺Url
		//2 �e�������|��ݬO�_�� ������Url���ɮץi����
		//3 �p�G�S�����|�ߥX404�����~
		//4 �p�G��쪺�OServlet  �|���ݬݦ�Servlet�O�_�w������(�w�g������F) 
		//5 �p�G�S������ �e���|�NServlet �إ߹���  �إߧ�����|�I�sinit()
		//6 �p�G�w������ΫإߤF�s���� �A�|�}�Ҥ@�շs������ǡA
			//���榹Servlet����service��k�A�ñNHttpServletRequest�PHttpServletResponse�ǩ󦹤�k
					
	}
}
