package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		System.out.println("imageFolder:"+imageFolder);
		Path imageDir = Paths.get(imageFolder);
		 Stream<Path> stream =  Files.list(imageDir);
		 HttpSession session = req.getSession(); 
		 List<String> list = new ArrayList<>();
		 session.setAttribute("imageList", list);
		 stream.forEach(p->{				
			 list.add(p.getFileName().toString());
		 });
		 resp.sendRedirect("showimage.jsp");
	}
}
