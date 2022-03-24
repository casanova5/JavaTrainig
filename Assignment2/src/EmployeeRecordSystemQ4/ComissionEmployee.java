package EmployeeRecordSystemQ4;

public class ComissionEmployee extends Employee{
	private double comissionPercentage;
	private double totalSales;

	public ComissionEmployee(int id, String name, double comissionPercentage, double totalSales) {
		super(id, name);
		this.comissionPercentage = comissionPercentage;
		this.totalSales = totalSales;
	}

	@Override
	public double getSalary() {
		return totalSales * comissionPercentage / 100;
	}
}
