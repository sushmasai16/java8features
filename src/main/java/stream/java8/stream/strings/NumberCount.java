package stream.java8.stream.strings;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberCount {
	
	
	public static void main(String[] args) {
		
		
		int[] arr = {1,2,3,4,5,1,1,3,5,10,6,7,8,3,8,8};
		
//		Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//		.entrySet().stream().forEach(entry -> {System.out.println(entry.getKey()+" : "+entry.getValue());});
				
		
		Integer[] arr1 = {1,2,3,4,5,1,1,3,5,10,6,7,8,3,8,8};
		
		Arrays.stream(arr1).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.forEach((num,count) -> {System.out.println(num +" - "+count);});
		
		
		
	}

}
