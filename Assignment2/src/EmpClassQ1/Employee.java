package EmpClassQ1;

class EmpData{
	private int id;
	private String first_name;
	private String last_name;
	private int salary;
	
	public EmpData(int id, String first_name, String last_name, int salary) {
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public int getSalary() {
		return salary;
	}
	
	public String getName() {
		return (first_name+" "+last_name);
	}
	
	public int getAnualSalary() {
		return salary*12;
	}
	
	public double raiseSalary(double percent) {
		return (salary*(percent/100))+salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", salary=" + salary
				+ "]";
	}
	
}

public class Employee {
	public static void main(String[] args) {
		EmpData ed = new EmpData(2,"Purva","Vijay",50000);
		System.out.println(ed.raiseSalary(18));
	}

	
}
