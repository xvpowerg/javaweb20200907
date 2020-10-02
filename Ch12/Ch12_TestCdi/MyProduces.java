package tw.com.web;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Produces;

public class MyProduces {
	@Produces
	public List<String> getFruit(){
		List<String> fruits = new ArrayList();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Charry");
		return fruits;
	}
	
	@Produces
	public List<String> getAnimal(){
		List<String> fruits = new ArrayList();
		fruits.add("Dog");
		fruits.add("Cat");
		fruits.add("Bear");
		return fruits;
	}
}
