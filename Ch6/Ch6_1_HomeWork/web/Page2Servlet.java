package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tw.com.bean.Item;
import java.util.List;
@WebServlet("/Page2Servlet")
public class Page2Servlet  extends HttpServlet{
	//HttpServletRequest  �s����Ū���s�����ǰe���T��
	//HttpServletResponse ��X���s����
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		 PrintWriter out = resp.getWriter();
		 //�]��Page2Servlet �t�d����Session�� �p�G�S�������ª�session�A�]�n�^��null
		HttpSession session = req.getSession(false);
		
		if (session == null) {
			out.println("���~�ާ@");
			return;
		}
		//�]��  counts�P itemList �����פ@��
		//counts�P itemList �����ޤ]�@��
		//��O�i�H�ϥΥH�U�覡
	    String[] counts= req.getParameterValues("count");
		List<Item> itemList = (List)session.getAttribute("itemList");
		for(int i =0;i< counts.length;i++) {
			 String countStr =  counts[i]==null||counts[i].trim().isEmpty()?
					 			"0":counts[i].trim();
			 try {
					int count = Integer.parseInt(countStr);
					itemList.get(i).setCount(count);
			 }catch(Exception ex) {
				 System.out.println(ex);
			 }		
			 
			 
		}
		
		
		
	}
}
