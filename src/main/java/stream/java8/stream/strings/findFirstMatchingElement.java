package stream.java8.stream.strings;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class findFirstMatchingElement {
	
	public static void main(String[] args) {
		
		
		List<String> strLst = Arrays.asList("sushma","hello","how","are","you","am","good","come","collect");
		
		Optional<String> firstElement = strLst.stream().filter(str -> str.startsWith("a")).findFirst();
		
		System.out.println(firstElement.get());
	}

}
