package lab7;

public class Employee {
	private int id;
	private String name ;
	private  double sal;
	public Employee() {
		super();
	}
	public Employee(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	

}
