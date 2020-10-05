package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.bean.TestRequestScore;
import tw.com.bean.TestSessionScoped;
@WebServlet("/Page3Servlet")
public class Page3Servlet extends HttpServlet {
	@Inject
	private TestSessionScoped tss;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 PrintWriter out = 	resp.getWriter();
	 tss.setName("Ken");
	 out.println("Page3Servlet Session...");
	 	
	}
}
