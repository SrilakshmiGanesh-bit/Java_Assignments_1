package Test;

public class Book {
	private String title;
	private String author;    
	private int price;
	public void setTitle(String title) {
		this.title=title;
	}
	public String getTitle() {
		return title;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	public String getAuthor() {
		return author;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void displayBook() {
		
		System.out.println("Author:"+author+"Title:"+title+"Price:"+price);
		
	}
}
