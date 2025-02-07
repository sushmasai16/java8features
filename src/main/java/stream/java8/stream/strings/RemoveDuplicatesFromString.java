package stream.java8.stream.strings;

import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromString {
	
	
	public static void main(String[] args) {
		
		
		String st = "sushmau";
		
//		st.chars().mapToObj(c -> (char)c).collect(Collectors.toSet()).forEach(c -> System.out.println(c));
		
		//printonly duplicate
		st.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().forEach(entr -> {
			
			if(entr.getValue() > 1) {
				System.out.println("key : "+entr.getKey());
			}
			
		});
		
	}

}
