package tw.com.model;

import java.io.IOException;
import java.util.List;

public class TestImage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\xvpow\\Ch20200907\\Ch9_2_UploadImage\\WebContent\\images";
      List<String> list =   ImageTools.getImageList(path);
      for (String img : list) {
    	  System.out.println(img);
      }
	}

}
