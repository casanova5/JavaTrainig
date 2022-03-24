package BankingSystemQ3;

public class BankPortal {
	public static void main(String[] args) {

		BankAcc account1 = new SavingsAccount("Purva", "123456789", 40000, 5, 1000);
		account1.withdraw(28000);
		System.out.println(account1);
		BankAcc account2 = new CurrentAccount("Ritviz", "987654321", 10000, "AB1234", 2000);
		account2.withdraw(15000);
		System.out.println(account2);
	}
}
