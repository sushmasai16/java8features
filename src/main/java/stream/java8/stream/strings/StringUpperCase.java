package stream.java8.stream.strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringUpperCase {
	
	public static void main(String[] args) {
		
		List<String> lstStr = Arrays.asList("sushma","abc","dtg","tanvi");
		
		lstStr = lstStr.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(lstStr);
//		lstStr.stream().map(String::toUpperCase).forEach(System.out::println);
		
	}

}
