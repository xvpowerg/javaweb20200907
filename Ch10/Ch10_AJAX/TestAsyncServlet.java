package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//asyncSupported = true 啟動非同步,又稱異步

@WebServlet(urlPatterns = {"/TestAsyncServlet"},
asyncSupported = true)
public class TestAsyncServlet  extends HttpServlet{
	private ExecutorService service = Executors.newFixedThreadPool(10);
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			resp.setContentType("text/html; charset=UTF8");
			System.out.println("Servlet Start!"+Thread.currentThread().getName());
			//PrintWriter out =  resp.getWriter();
			//System.out.println("Submit Start!");
		AsyncContext ctx = req.startAsync();
			service.submit(()->{
				System.out.println("Submit Start!"+Thread.currentThread().getName());
				try {
					PrintWriter out = ctx.getResponse().getWriter();
					out.println("開始!!");				
					TimeUnit.SECONDS.sleep(10);	
					out.println("完成10秒任務");
					ctx.complete();
				}catch(Exception ex) {
					
				}
				
				
			});

			
		}
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		}
}
