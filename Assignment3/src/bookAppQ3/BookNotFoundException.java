package bookAppQ3;

public class BookNotFoundException extends RuntimeException{
	public static void main(String[] args) {
		System.out.println("No such book in records.");
	}
}