package stream.java8.stream.strings;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseStringstr {
	
	public static void main(String[] args) {
		
		String str = "sushma";
		
		String rev = 
		IntStream.range(0, str.length())
		.mapToObj(i -> str.charAt(str.length()-i-1))
		.map(String::valueOf)
		.collect(Collectors.joining("#","$","@"));
		
		System.out.println(rev);
		
		
				IntStream.range(0, str.length())
				.mapToObj(i -> str.charAt(str.length()-i-1))
				.map(String::valueOf)
				.forEach(System.out::println);
				
				String s1 = new StringBuilder(str).reverse().toString();
		
		System.out.println(s1);
		
		str.chars().mapToObj(c -> (char)c).forEach(System.out::println);
		
		
	
	}

}
