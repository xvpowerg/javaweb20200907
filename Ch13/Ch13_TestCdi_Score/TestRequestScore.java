package tw.com.web;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class TestRequestScore {
	private String name = "Empty";
	
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
