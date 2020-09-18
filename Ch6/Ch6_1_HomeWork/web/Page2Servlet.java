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
	//HttpServletRequest  瀏覽器讀取瀏覽器傳送的訊息
	//HttpServletResponse 輸出到瀏覽器
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		 PrintWriter out = resp.getWriter();
		 //因為Page2Servlet 負責接收Session的 如果沒有收到舊的session，因要回傳null
		HttpSession session = req.getSession(false);
		
		if (session == null) {
			out.println("錯誤操作");
			return;
		}
		//因為  counts與 itemList 的長度一樣
		//counts與 itemList 的索引也一樣
		//於是可以使用以下方式
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
