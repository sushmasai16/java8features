package stream.java8.stream.strings;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountCharcount {
	
	
	public static void main(String[] args) {
		
		
		String str = "sushma";
		
		Map<Character, Long> collect = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
		collect.entrySet().forEach(ent -> System.out.println("char : "+ent.getKey()+" count : "+ent.getValue()));
		
		
	}

}
