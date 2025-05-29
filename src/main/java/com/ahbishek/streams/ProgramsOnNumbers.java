package com.ahbishek.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ProgramsOnNumbers {
	
	public static void main(String[] args) {
		
		
		Integer num[] = {1,2,2,3,5,4,6,4,7,8,9,1,2,3,4};
		
		//find sum 
		int sum = Arrays.stream(num).mapToInt(Integer::intValue).sum();
		System.out.println("sum : "+sum);
		
		int[] arr = {1,2,2,3,5,4,6,4,7,8,9,1,2,3,4};
		int sum1 = Arrays.stream(arr).sum();
		System.out.println("Sum1: " + sum1);
		
		//count
		
		long count = Arrays.stream(num).mapToInt(Integer::intValue).count();
		System.out.println("count : "+count);
		
		long count2 = Arrays.stream(arr).count();
		System.out.println("count2 : "+count2);
		
		
		//average
		OptionalDouble average = Arrays.stream(num).mapToInt(Integer::intValue).average();
		average.ifPresent(n -> System.out.println("average : "+n));
//		System.out.println("average : "+average);
		
		OptionalDouble average2 = Arrays.stream(arr).average();
		average.ifPresent(n -> System.out.println("average2 : "+n));
		
		
		Arrays.stream(num)
				.collect(Collectors.groupingBy(n -> n, Collectors.counting()));
		
		  Map<Integer, Long> countMap = Arrays.stream(num)
	                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));
		
		
		  
		  
		  int[] arr1 = {1,2,2,3,5,4,6,4,7,8,9,1,2,3,4};
		List<Integer> lnums = Arrays.asList(1,2,3,4,5,6,7,2,3,4,5,6,2,2); 
		
		  Set<Integer> collect = Arrays.stream(arr1)
		  .filter(num1 -> {
			  
			  return IntStream.range(2, num1)
			  .allMatch(n -> num1%n != 0 );
			  
		  })
		  .boxed()
		  .collect(Collectors.toSet());
//		  
		  System.out.println("collect : "+collect);
		  
		  Set<Integer> collect2 = lnums.stream()
		  .filter(num1 -> {
			  
			  return IntStream.range(2, num1)
			  .allMatch(n -> num1%n != 0 );
			  
		  })
		  .collect(Collectors.toSet());
		  
	}

}
