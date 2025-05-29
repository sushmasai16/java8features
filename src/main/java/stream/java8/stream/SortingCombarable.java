package stream.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortingCombarable {
	
	
	
	
	
	public static void main(String[] args) {
		
		List<Integer> lnums = Arrays.asList(1,2,3,4,5,6,7,2,3,4,5,6,2,2); 
		
		
		List<Integer> snum = lnums.stream().sorted()
		.distinct()
		.map(n -> n)
		.dropWhile(n -> n < 5)
		.collect(Collectors.toList());
		
		snum.stream().forEach(System.out::println);
		
		
		List<EmployeeBOSort>  lempsort = Arrays.asList(
				new EmployeeBOSort(10000,"sushma","Java"),
				new EmployeeBOSort(30000,"ravi","Marketing"),
				new EmployeeBOSort(20000,"tanvi","student"),
				new EmployeeBOSort(50000,"srikanth","Marketing"),
				new EmployeeBOSort(80000,"swetha","HR"),
				new EmployeeBOSort(15000,"ypr","HR"),
				new EmployeeBOSort(8000,"bhoomi","student"),
				new EmployeeBOSort(60000,"sai","HR")
				);
				
		List<Integer> collect = lempsort.stream()
				.filter(emp -> emp.getJob().equalsIgnoreCase("HR"))
				.map(EmployeeBOSort::getSalary)
		.sorted()
		.dropWhile(sal -> sal < 50000)
		.collect(Collectors.toList());
		
		System.out.println("set : "+collect);
		
		//group the all based on there job
		
		lempsort.stream().collect(Collectors.groupingBy(EmployeeBOSort::getJob))
		.forEach((k,v) -> {
			System.out.println(k);
			System.out.println(v.toString());
		});
		
//		partition the all based on there sal
		
		Map<Boolean, List<EmployeeBOSort>> collect2 = lempsort.stream().collect(Collectors.partitioningBy(emp -> emp.getSalary() > 50000));
		
		
		
	}
	

}
