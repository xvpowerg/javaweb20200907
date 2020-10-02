package tw.com.web;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Produces;
import javax.inject.Named;

public class MyProduces {
	@Produces
	@Named("fruit")
	public List<String> getFruit(){
		List<String> fruits = new ArrayList();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Charry");
		return fruits;
	}
	
	@Produces
	@Named("animal")
	public List<String> getAnimal(){
		List<String> fruits = new ArrayList();
		fruits.add("Dog");
		fruits.add("Cat");
		fruits.add("Bear");
		return fruits;
	}
}
