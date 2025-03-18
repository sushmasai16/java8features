package com.ahbishek.streams;

import java.util.Objects;

//public class Employee implements Comparable<Employee>{
	public class Employee {
	
	
	private String name;
	
	private int salary;
	
	private int id;

	public Employee(String name, int salary,int id) {
		super();
		this.name = name;
		this.salary = salary;
		this.id = id;
	}

	@Override
	public String toString() {
		return "id=" + id + "name=" + name + ", salary=" + salary;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id;
	}

	public int getSalary() {
		return salary;
	}
	
	public int getId() {
		return id;
	}

//	@Override
//	public int compareTo(Employee o) {
//		// TODO Auto-generated method stub
//		return o.getId() - this.getId();
//	}
	

}
