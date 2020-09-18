package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tw.com.bean.Item;
import java.util.ArrayList;
import java.util.List;
@WebServlet("/Page1Servlet")
public class Page1Servlet  extends HttpServlet{
	//HttpServletRequest  瀏覽器讀取瀏覽器傳送的訊息
	//HttpServletResponse 輸出到瀏覽器
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		String[] items = req.getParameterValues("item");
		List<Item> itemList = new ArrayList<>(items.length);
		for (String id : items) {
			itemList.add(Item.newItem(id));
		}	
		session.setAttribute("itemList", itemList);

		
	}
}
