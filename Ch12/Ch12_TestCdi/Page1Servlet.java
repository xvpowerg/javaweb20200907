package tw.com.web;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Page1Servlet")
public class Page1Servlet  extends HttpServlet{
	//注入
	@Inject
	private Product p1;
	@Inject
	//加入Qualifiers
	//新增限定詞
	@Named("animal")
	private List<String> fruitList;
			@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				p1.setName("Android");
				p1.setPrice(20);
				System.out.println(p1);	
				System.out.println(fruitList);				
	}
}
