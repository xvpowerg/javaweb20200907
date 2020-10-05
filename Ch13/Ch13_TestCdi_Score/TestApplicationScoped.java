package tw.com.bean;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;

@ApplicationScoped
public class TestApplicationScoped {
	
		private String name = "Empty";
		private int count = 0;
		public int getCount() {
			return count;
		}
		public void add() {
			count++;
		}
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		

		@Override
		public String toString() {
			return "TestRequestScore [name=" + name + "]";
		}
		
}
