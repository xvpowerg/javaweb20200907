package tw.com.bean;

public class Item {
   private String name;
   private int price;
   private int count;
	public Item(String name, int price) {
		this.name = name;
		this.price = price;		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	public int total() {
		return count * price;
	}
	
	public static Item newItem(String id) {
		Item item = new Item("",0);
		switch(id) {
		case "0":
			item = new Item("Java",800);
			break; 
		case "1":	
			item = new Item("Python",700);
			break; 
		case "2":	
			item = new Item("Golan",650);
			break; 	
		}
		return item;
	}
	
   
}
