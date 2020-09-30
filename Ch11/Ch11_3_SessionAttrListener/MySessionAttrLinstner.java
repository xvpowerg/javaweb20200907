package tw.com.web;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
@WebListener
public class MySessionAttrLinstner implements HttpSessionAttributeListener {

	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		String name = event.getName(); 
		String value = event.getValue().toString();
		
		System.out.println("attributeAdded "+name+":"+value);
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		String name = event.getName(); 
		String value = event.getValue().toString();
		
		System.out.println("attributeRemoved "+name+":"+value);
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		String name = event.getName(); 
		String value = event.getValue().toString();
		
		System.out.println("attributeReplaced "+name+":"+value);
	}

	
	
}
