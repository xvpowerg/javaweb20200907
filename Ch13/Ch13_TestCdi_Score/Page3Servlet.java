package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.bean.TestApplicationScoped;
import tw.com.bean.TestRequestScore;
import tw.com.bean.TestSessionScoped;
import java.time.LocalTime;
@WebServlet("/Page3Servlet")
public class Page3Servlet extends HttpServlet {
	@Inject
	private TestSessionScoped tss;
	@Inject
	private TestApplicationScoped tas;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 PrintWriter out = 	resp.getWriter();
	 tss.setName("Ken");
	 out.println("Page3Servlet Session...");
	 out.println("Page3Servlet Application...");
	 tas.setName(LocalTime.now().toString());
	 tas.add();
	 	
	}
}
