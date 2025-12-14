package com.ahbishek.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeMain {
	
	
	public static void main(String[] args) {
		
		List<Employee> emp = getEmployeeDetails();
		List<Employee> emp1 = getEmployeeDetails();
		List<Employee> emp2 = getEmployeeDetails();
		//distinct
		//emp.stream()
		//.distinct().forEach(System.out::println);
		
		//skip record
//		emp.stream()
//		.skip(3).forEach(System.out::println);
		
		//limiting the number of record
//		emp.stream()
//		.limit(8).forEach(System.out::println);
		
		
		//sorting
//		emp.stream()
////		.map(Employee::getId)
//		.sorted((emp1, emp2) -> Integer.compare(emp2.getId(), emp1.getId()))
//		.forEach(System.out::println);
		
		
		emp.stream()
//		.map(Employee::getId)
		
//		.sorted((emp1, emp2) -> Integer.compare(emp1.getSalary(), emp2.getSalary()))
//		.filter(empf -> empf.getSalary() > 60000)
//		.dropWhile(empf -> empf.getSalary() < 70000)
//		.takeWhile(empf -> empf.getSalary() < 70000)
		.forEach(System.out::println);
		
	}

	private static List<Employee> getEmployeeDetails() {
		// TODO Auto-generated method stub
		List<Employee> emp = Arrays.asList(
				new Employee("sushma", 60000,101),
				new Employee("tanvi", 100000,106),
				new Employee("ravi", 80000,103),
				new Employee("swetha", 70000,107),
				new Employee("srikanth", 80000,102),
				new Employee("ypr", 60000,106),
				new Employee("test", 40000,108)
				);
		return emp;
	}

}
