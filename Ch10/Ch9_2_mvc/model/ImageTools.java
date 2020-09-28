package tw.com.model;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ImageTools {
	public static List<String> getImageList(String path) throws IOException{
		Path imageDir = Paths.get(path);
		 Stream<Path> stream =  Files.list(imageDir);		
		 List<String> list = new ArrayList<>();
		 stream.forEach(p->{				
			 list.add(p.getFileName().toString());
		 });
		 return list;
	}
	
	public static boolean createImageFile(InputStream in,String filePath) {
		try(OutputStream out = new FileOutputStream(filePath);
			BufferedOutputStream bout  = 
					new  BufferedOutputStream(out);){
				int data = -1;
				while ( (data = in.read() )!=-1) {		
					bout.write(data);
				}			
			}catch(Exception ex) {
				return false;
			}
		return true;
	}
}
