package stream.java8.stream;

public class EmployeeBOSort {
	
	
	
	public EmployeeBOSort(int salary, String name,String job) {
		super();
		this.salary = salary;
		this.name = name;
		this.job = job;
	}
	@Override
	public String toString() {
		return "EmployeeBOSort [salary=" + salary + ", name=" + name + ", job=" + job + "]";
	}
	private int salary;
	private String name;
	private String job;
	

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
	
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}

}
