package EmployeeRecordSystem;

abstract class Employee{
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

	abstract public double getSalary() ;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}

public class EmployeeRecords{
	public static void main(String[] args) {
		Employee employee=new
				ComissionEmployee(22, "purva", 3.3, 2000000);
		System.out.println("The salary for comissioned employee is:");
		System.out.println(employee.getSalary());
	}
}
