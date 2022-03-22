//Hourly employee -> They are paid by the hour. 
//They have an hourly rate and their payment will depend on how 
//many hours they worked. The more they work, the more they will be paid. 
//So, the salary will be [hour worked per week* hourly rate].

package PaymentSystem;

public class HourlyEmployees extends Employee{
	private double ratePerhour;
	private double NumOfhours;
	
	public HourlyEmployees(int id, String name, double ratePerhour, double numOfhours) {
		super(id, name);
		this.ratePerhour = ratePerhour;
		NumOfhours = numOfhours;
	}

	public double getPayment() {
		return (this.ratePerhour * NumOfhours);
	}

}
