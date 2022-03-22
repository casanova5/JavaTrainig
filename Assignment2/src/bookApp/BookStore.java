package bookApp;

public class BookStore {
	private final int SIZE;
	private Book[] books;
	
	public BookStore(int size) {
		SIZE=size;
		this.books = new Book[SIZE];
		init();
	}

	private void init() {
			books[0]=new Book("Harry Potter", "JK Rowling", "123141A", 14);
			books[1]=new Book("Sherlock Holmes", "ACD", "236471B", 10);
			books[2]=new Book("One Piece", "Oda", "867800C", 18);
			books[3]=new Book("Naruto", "Kishimoto", "534576D", 20);
			books[4]=new Book("Haikyuu", "Haruichi", "867641E", 10);
	}


	public void sell(String Title, int noOfCopies) {
		boolean search=false;
		for(int i=0;i<SIZE; i++) {
			if(	books[i].getTitle().equals(Title)) {
				books[i].setNoOfCopies(books[i].getNoOfCopies()-noOfCopies);
				search=true;
			}
		}
		if(search)
			System.out.println("Book "+Title+" sell is successful!");
		else
			System.out.println("Book is not available in the store");
	}

	public void order(String Title, int noOfCopies) {
		boolean search=false;
		for(int i=0;i<SIZE; i++) {
			if(	books[i].getTitle().equals(Title)) {
				books[i].setNoOfCopies(books[i].getNoOfCopies()+noOfCopies);
				search=true;
			}
		}
		if(search)
			System.out.println("Book order "+Title+" is successful");
		else
			System.out.println("Store out of limit, can't order new book.");
	}

	public void display() {
		System.out.println("-----------Books details-------------");
		for(Book book: books) {
			book.display();
		}
		System.out.println("**************************************");
		
	}
}
