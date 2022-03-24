package BankingSystemQ3;

public class CurrentAccount extends BankAcc{
	private String tradeLicenseNumber;
	private double overdraft;

	public CurrentAccount(String name, String accountNumber, double accountBalance,
			String tradeLicenseNumber,double overdraft) {
		super(name, accountNumber, accountBalance);
		this.tradeLicenseNumber = tradeLicenseNumber;
		this.overdraft = overdraft;
	}

	public void withdraw(double amount) {
		double allowedWithdrawal= getAccountBalance()+ overdraft;
		
		if(allowedWithdrawal>=amount) {
			setAccountBalance(getAccountBalance()-amount);
			System.out.println("amount "+ amount+" is withdrawn from current account");
		}else
			System.out.println("You can not withdraw, dont have sufficient balance and overdraft limit  ...");
	}

	@Override
	public String toString() {
		return super.toString()+
				"CurrentAccount [tradeLicenseNumber=" + tradeLicenseNumber + ", "
				+ "overdraft=" + overdraft + "]";
	}

}
