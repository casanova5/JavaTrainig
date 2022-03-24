package UserRegistrationQ5;

public class UserRegisteration {
	public static void main(String[] args) {
		
		RegisterUser registration=new RegisterUser();
		try {
			registration.registerUser("zeke", "usa");
		} catch (InvalidCountryException e) {
			System.out.println(e.getMessage());
		}
	}
}
