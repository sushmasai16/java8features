package stream.java8.stream.strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class cortString {
	
	public static void main(String[] args) {
		
		List<String> lstStr = Arrays.asList("sushma","abhi","ravi","tanvi","bb","cc","ee","zz","gg");
		
		lstStr.sort((s1,s2) -> s1.compareTo(s2));
		
		System.out.println(lstStr);
		
//		lstStr.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		
	}

}
