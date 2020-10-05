package tw.com.bean;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
@SessionScoped
public class TestSessionScoped implements Serializable {
private String name = "Empty";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "TestSessionScoped [name=" + name + "]";
	}
	
}
