package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Page1Servlet")
public class Page1Servlet extends HttpServlet {
	@Inject
	private TestRequestScore trs;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 PrintWriter out = 	resp.getWriter();
	 out.println("Page1Servlet ...");
	 trs.setName("Howard");
	}
}
