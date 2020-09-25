#  MVC與UploadImage
## MVC
* M Model 商業邏輯 資料庫等計算 如:一般的類別與物件
* V View  顯示畫面 如:Jsp
* C Controller 控制 如:Servlet
# 上傳檔案
* form 的 method 要設為 post
* enctype 要設定為multipart/form-data
```html
	<form action="UploadImageServlet" method="post" enctype="multipart/form-data">
    <!-- accept="image/*" 指選擇檔案的附檔名必須是image類型的-->
	 請選擇路上傳圖片的路徑:<input type="file" name="photo" accept="image/*"/>
	 <button>上傳</button>
	</form>
```
