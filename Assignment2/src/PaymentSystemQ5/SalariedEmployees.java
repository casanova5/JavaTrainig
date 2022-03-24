//Salaried employee-> This type of employees are paid a fixed weekly 
//salary regardless of the number of hours worked.

package PaymentSystemQ5;


public class SalariedEmployees extends Employee{
	private double fixedWeeklySalary;
	
	public SalariedEmployees(int id, String name, double fixedWeeklySalary) {
		super(id, name);
		this.fixedWeeklySalary=fixedWeeklySalary;
	}
	@Override
	public double getPayment() {
		return fixedWeeklySalary;
	}

}
