#  MVC與UploadImage
## MVC
* M Model 商業邏輯 資料庫等計算 如:一般的類別與物件
* V View  顯示畫面 如:Jsp
* C Controller 控制 如:Servlet
# 上傳檔案 前端
* form 的 method 要設為 post
* enctype 要設定為multipart/form-data
```html
	<form action="UploadImageServlet" method="post" enctype="multipart/form-data">
    <!-- accept="image/*" 指選擇檔案的附檔名必須是image類型的-->
	 請選擇路上傳圖片的路徑:<input type="file" name="photo" accept="image/*"/>
	 <button>上傳</button>
	</form>
```
# 上傳檔案 Servlet
注意要加上 @MultipartConfig
範例如下:
```java
@MultipartConfig
@WebServlet("/UploadImageServlet")
public class UploadImageServlet extends HttpServlet {
	
}
```
# 加上@MultipartConfig就可使用Part，Part可以取得檔案資訊如下
```java
Part part = req.getPart("photo");
		String fileName = part.getSubmittedFileName();
```

