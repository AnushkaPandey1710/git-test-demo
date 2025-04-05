package programming.stream.example;

public class Employee {

	private String name;
	private String dept;
	private long salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public Employee(String name, String dept, long salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	public Employee(String name, int salary) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
}
