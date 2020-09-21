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
		//1 由客戶端瀏覽器發送HTTP協定訊號，指定要運行的Url
		//2 容器收到後會察看是否有 對應的Url的檔案可執行
		//3 如果沒有找到會拋出404的錯誤
		//4 如果找到的是Servlet  會先看看此Servlet是否已有實體(已經有物件了) 
		//5 如果沒有實體 容器會將Servlet 建立實體  建立完畢後會呼叫init()
		//6 如果已有實體或建立了新實體 ，會開啟一組新的執行序，
			//執行此Servlet物件的service方法，並將HttpServletRequest與HttpServletResponse傳於此方法
					
	}
}
