package stream.java8.stream.strings;

import java.util.stream.Collectors;

public class RemoveSpecialChars {
	
	public static void main(String[] args) {
		String str = "!sushma  %hi";
		
		String collect = str.chars().filter(c -> Character.isLetterOrDigit(c) || Character.isWhitespace(c))
		.mapToObj(c -> (char)c)
//		.map(c -> String.valueOf(c))
		.map(String::valueOf)
		.collect(Collectors.joining());
		
		System.out.println("final String : "+collect);
	}

}
