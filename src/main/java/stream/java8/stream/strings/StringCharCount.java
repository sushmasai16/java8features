package stream.java8.stream.strings;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringCharCount {
	
	
	public static void main(String[] args) {
		
		String str = "i am sushma i am good how are you i am also nice";
		
//		str.chars().mapToObj(c -> (char)c).
//		collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//		.forEach((c,cnt) -> {
//			System.out.println(c+ " "+cnt);		});
		
		Arrays.stream(str.split(" "))
//		collect(Collectors.toList())
//		.stream()
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.forEach((word,cnt) -> {
			System.out.println(word+ " "+cnt);		});
//		Arrays.stream(str.split(" ")).forEach((cnt) -> {
//			System.out.println(" "+cnt);		});
		
		
		String[] a =  str.split(" ");
		
		String collect2 = Arrays.stream(a).map(word -> new StringBuilder(word).reverse())
		
		.collect(Collectors.joining(" "));
		
		System.out.println("oooooooooooooooooooooo : "+collect2);
		
		String collect = IntStream.range(0, str.length())
		.mapToObj(i -> str.charAt(str.length() - 1 - i))
		.map(String::valueOf)
		.collect(Collectors.joining())
		;
		
		System.out.println("reverse String : "+collect);
		
		
		String collect1 = IntStream.iterate(0, i -> i < str.length(), i -> i+ 1)
		.mapToObj(i -> str.charAt(str.length() - 1 - i))
		.map(String::valueOf)
		.collect(Collectors.joining())
		;
		
		System.out.println("reverse gggg String : "+collect1);
		
		
		 String collect3 = Arrays.stream(a).map(word -> {
			return IntStream.range(0, word.length())
			.mapToObj(i -> word.charAt(word.length() - 1 - i))
			.map(String::valueOf)
			.collect(Collectors.joining(""));
		})
				
				.collect(Collectors.joining(" "));
		 
		 
		 System.out.println("pppppppppppppppp : "+collect3);
		
		
		
		
		
		
	}

}
