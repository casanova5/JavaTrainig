package UserRegistrationQ5;

public class InvalidCountryException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public InvalidCountryException(String message) {
		super(message);
	}
}
