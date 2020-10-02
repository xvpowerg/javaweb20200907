package tw.com.web;

import javax.inject.Inject;

public class Student {
	private Book book = null;
	
	
	public Book getBook() {
		book.setName("IOS");
		book.setPrice(10);
		return book;
	}
	@Inject
	public void setBook(Book book) {
		this.book = book;
	}
	
}
