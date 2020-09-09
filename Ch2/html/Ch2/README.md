#HTML 標籤 
## img 圖片
```html
 <img src="images/dog1.jpg" alt="我是狗狗!" >
```
## ul 與 li
常用於導航欄
```html
  <ul>
        <li><a href="#">蘋果</a></li>
        <li>香蕉</li>
        <li>鳳梨</li>
  </ul>
```
# css
1. border-radius: 50%; 可設定圓邊
2. text-decoration: none; 可取消連接底線
```css
     a{
            text-decoration: none;
        }
```
3. 偽類選擇 可改變 連接樣式 注意必須按以下順序寫
```css
   /*未使用的網址*/   
     li  a:link{
        color: cadetblue;            
    }
     /*已使用的網址*/   
     li  a:visited{
        color: chocolate;
    }
    /*滑鼠移動到連接*/   
    li a:hover{
        color:darkolivegreen;
        font-size: 30px;
        text-decoration: underline;
    }
    /*按下連接時*/   
    li  a:active{
        font-size: 16px;
    }
```
