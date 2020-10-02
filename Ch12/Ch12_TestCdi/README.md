# CDI (Contexts and Dependency Injection)
* 使用@Inject方式創造物件
* 注意必須把beans.xml放到WEB-INF內
* 如果Qualifiers重複 必須加上@Named 如下
```java
package tw.com.web;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

public class MyProduces {
	@Produces
	@Named("fruit")
	public List<String> getFruit(){
		List<String> fruits = new ArrayList();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Charry");
		return fruits;
	}
	
	@Produces
	@Named("animal")
	public List<String> getAnimal(){
		List<String> fruits = new ArrayList();
		fruits.add("Dog");
		fruits.add("Cat");
		fruits.add("Bear");
		return fruits;
	}
}
```
* 呼叫Serlvet
```java
package tw.com.web;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Page1Servlet")
public class Page1Servlet  extends HttpServlet{
	//注入
	@Inject
	private Product p1;
	@Inject
	//加入Qualifiers
	//新增限定詞
	@Named("animal")
	private List<String> fruitList;
	@Inject
	Student st;
			@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				p1.setName("Android");
				p1.setPrice(20);
				System.out.println(p1);	
				System.out.println(fruitList);		
				System.out.println(st.getBook());	
			
	}
}


```
