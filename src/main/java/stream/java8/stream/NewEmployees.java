package stream.java8.stream;

public class NewEmployees {
	
	
	private int salary;
	private String name;
	
	private String dept;
	
	
	public NewEmployees(int salary, String name,String dept) {
		super();
		this.salary = salary;
		this.name = name;
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
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
}
