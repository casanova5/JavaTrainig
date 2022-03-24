package PaymentSystemQ5;

abstract class Employee implements Payable{
	private int id;
	private String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	abstract public double getPayment();
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}

public class EmployeeRecords{
	public static void main(String[] args) {
		Employee employee=new ComissionEmployee(22, "purva", 3.2, 2000000);
		Invoice invoice= new Invoice("A123", "Electronic23W", 20, 3000);
		
		PaymentProcessingSystem.processPayment(employee);
	}
}
