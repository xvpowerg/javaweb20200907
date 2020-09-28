package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tw.com.model.ImageTools;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
@WebServlet("/ShowImageServlet")
public class ShowImageServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String imageFolder = 
				getServletContext().getInitParameter("image_folder");		
		List<String> list = ImageTools.getImageList(imageFolder);			 
		 HttpSession session = req.getSession();
		 session.setAttribute("imageList", list);
		 resp.sendRedirect("showimage.jsp");
	}
}
