package tw.com.web;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.File;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.activemq.protobuf.BufferOutputStream;

import tw.com.model.ImageTools;
@MultipartConfig
@WebServlet("/UploadImageServlet")
public class UploadImageServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String imageFolder = this.getServletContext().getInitParameter("image_folder");
		Part part = req.getPart("photo");		
		String fileName = part.getSubmittedFileName();		
		imageFolder = imageFolder+File.separator+fileName;
		
		try(InputStream in=  part.getInputStream()){			
			ImageTools.createImageFile(in, imageFolder);
		}
		
		//顯示上傳完成
		//顯是一個連結  檢視上傳圖片
		resp.sendRedirect("msg.html");
		
	}
}
