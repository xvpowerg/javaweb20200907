package tw.com.web;

public class Book implements Product{
	private int price;
	private String name;
	
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setPrice(int price) {
		// TODO Auto-generated method stub
		this.price = price;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+":"+price;
	}
	
	
		
}
