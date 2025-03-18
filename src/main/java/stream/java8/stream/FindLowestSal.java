package stream.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class FindLowestSal {
	
	public static void main(String[] args) {
		
		
		List<NewEmployees> emplist = new ArrayList<>(Arrays.asList(
				new NewEmployees(100,"sushma","IT"),
				new NewEmployees(1000,"srikant","MARKETTING"),
				new NewEmployees(10000,"taniv","SCHOOL"),
				new NewEmployees(40000,"YPR","MARKETTING"),
				new NewEmployees(50000,"Bhommi","SCHOOL"),
				new NewEmployees(60000,"Ravi","MARKETTING"),
				new NewEmployees(80000,"sai","SCHOOL")
				));
		int orElse = emplist.stream().map(NewEmployees::getSalary).mapToInt(Integer::valueOf).sorted().findFirst().orElse(0);
		System.out.println("leat emp : "+orElse);
		
		int highest = emplist.stream().map(NewEmployees::getSalary).mapToInt(Integer::valueOf).boxed().sorted((a,b)->b-a).findFirst().orElse(0);
		System.out.println("highest emp : "+highest);
		
		String highestsalName = emplist.stream()
		.sorted((e1,e2)->Integer.compare(e2.getSalary(), e1.getSalary()))
		.map(NewEmployees::getName)
		.findFirst()
		.orElse("no highest sal emp");
		
		
		System.out.println("highestsalName : "+highestsalName);
		
		String lowestsalName = emplist.stream()
				.sorted(Comparator.comparing(NewEmployees::getSalary))
				.map(NewEmployees::getName)
				.findFirst()
				.orElse("no lowest sal emp");
		
		System.out.println("lowestsalName : "+lowestsalName);
		
		
		 int orElse2 = emplist.stream().filter(emplis -> emplis.getSalary() > 10000)
				 .map(NewEmployees::getSalary).mapToInt(Integer::valueOf).min().orElse(0);

		 System.out.println("min : "+orElse2);
		 
		 List<NewEmployees> emplist2 = emplist;
		emplist2.stream().collect(Collectors.groupingBy(NewEmployees::getDept)).
		 forEach((dept,emp) -> { int lowestSalary =  emp.stream().sorted((e1,e2) -> Integer.compare(e2.getSalary(),e1.getSalary()))
				 .map(NewEmployees::getSalary).findFirst().orElse(0);
		 
		 System.out.println("dept : "+dept+" sal : "+lowestSalary);
				 
		 });
		 
		 System.out.println("map : "+emplist2);
	}

}
