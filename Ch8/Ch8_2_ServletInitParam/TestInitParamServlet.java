package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
//注意要設定name與xml一樣
@WebServlet(name="TestInitParamServlet",urlPatterns = {"/TestInitParamServlet"})
public class TestInitParamServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		out.println("TestInitParamServlet!!");
		 String path = getInitParameter("path");
		 System.out.println(path);
		 String account = getInitParameter("account");
		 System.out.println(account);
		 
		 Path pathObj = Paths.get(path);		 
		 Stream<Path> st =  Files.list(pathObj);
		 st.forEach(p->{System.out.println(p);});
		 
		 
	}
}
