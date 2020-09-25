package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
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
		 stream.forEach(p->{			 
			 System.out.println(p);
		 });
		
	}
}
