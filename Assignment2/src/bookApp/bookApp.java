package bookApp;

class Book{
	private String title;
	private String author;
	private String ISBN;
	private int noOfCopies;
	
	public Book(String title, String author, String iSBN, int noOfCopies) {
		this.title = title;
		this.author = author;
		ISBN = iSBN;
		this.noOfCopies = noOfCopies;
	}
	
	public void display() {
		System.out.println(title+"--"+author+"--"+ISBN+"--"+noOfCopies);
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getISBN() {
		return ISBN;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

}

public class bookApp {
	public static void main(String[] args) {
		BookStore bookStore=new BookStore(5);
		bookStore.sell("Naruto", 2);
		bookStore.display();
		
	}

}
