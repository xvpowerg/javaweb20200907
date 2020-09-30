package tw.com.web;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class TestRequestAttrListener  
	implements ServletRequestAttributeListener{

	@Override
	public void attributeAdded(ServletRequestAttributeEvent event) {
		System.out.println("Request attributeAdded!!:"+event.getValue());
	}
	@Override
	public void attributeRemoved(ServletRequestAttributeEvent event) {
		System.out.println("Request attributeRemoved!!"+event.getValue());
	}
	//attributeReplaced 的value會取得舊的數值
	@Override
	public void attributeReplaced(ServletRequestAttributeEvent event) {
		
		System.out.println("Request attributeReplaced!!"+event.getName()+
				":"+event.getValue());
	}

	
	
}
