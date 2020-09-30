package tw.com.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import tw.com.bean.User;
@WebListener
public class MyServletContextListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent even) {
		List<User> userList = new ArrayList<>();
		even.getServletContext().setAttribute("userList", userList);				
	}
		
}
