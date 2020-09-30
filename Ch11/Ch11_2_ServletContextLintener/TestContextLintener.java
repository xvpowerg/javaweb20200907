package tw.com.web;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class TestContextLintener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
	System.out.println("TestContextLintener contextDestroyed ");
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		System.out.println("TestContextLintener contextInitialized ");
	}
   
}
