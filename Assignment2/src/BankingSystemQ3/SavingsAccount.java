package BankingSystemQ3;

public class SavingsAccount extends BankAcc{
	private double interest=5.0;
	private double maxWithdrawAmountLimit;
	private double minimumBalance;

	public SavingsAccount(String name, String accountNumber, double accountBalance, 
			double interest, double minimumBalance) {
		super(name, accountNumber, accountBalance);
		this.interest=interest;
		this.minimumBalance=minimumBalance;
		
		this.maxWithdrawAmountLimit=accountBalance-minimumBalance;
	}
	
	public double getBalance() {
		return getAccountBalance()*(100+interest)/100;
	}
	
	public void withdraw(double amount) {
		if(amount<=maxWithdrawAmountLimit) {
			setAccountBalance(getAccountBalance()-amount);
			System.out.println("amount "+ amount+" is withdrawn from savings account");
		}else
			System.out.println("You can not withdraw as min balance required ...");
	}

	@Override
	public String toString() {
		return "SavingsAccount [interest=" + interest + ", maxWithdrawAmountLimit=" + maxWithdrawAmountLimit
				+ ", minimumBalance=" + minimumBalance + "]";
	}
	
	
}
