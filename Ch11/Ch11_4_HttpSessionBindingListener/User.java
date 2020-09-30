package tw.com.bean;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class User implements HttpSessionBindingListener{
	private String userName;

	
	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		ServletContext app = 
				event.getSession().getServletContext();
		List<User> list = (List<User>)app.getAttribute("userList");
		list.add(this);
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		ServletContext app = 
				event.getSession().getServletContext();
		List<User> list = (List<User>)app.getAttribute("userList");
		list.remove(this);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
