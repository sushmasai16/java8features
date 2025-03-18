package com.reduce;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Reduce {
	public static void main(String[] args) {
		
		List<Integer> lst = Arrays.asList(1,2,3,4,5,6);
		
//		lst.stream().reduce((a,b) ->{
//			System.out.println("first a : "+a);
//			System.out.println("first b : "+b);
//			return a+b;
//		}).ifPresent(System.out::print);
	
		
		List<String> largestlength = Arrays.asList("sus","yama","hellow","i","iam");
		
		largestlength.stream()
		.reduce((s1,s2) -> {
			
			System.out.println("s1 : "+s1);
			System.out.println("s2 : "+s2);
			
			return s1.length() > s2.length() ? s1 : s2;
		} 
		)
		.ifPresent(System.out::print);
		
		
		List<Integer> dub = Arrays.asList(1,2,3,4,5,6,3,2,5,8,9,10,4);
		
		List<String> strbub = Arrays.asList("s","rr","ss","s","ss","a","b","b");
		
		strbub.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()))
		.entrySet()
		.stream()
		.filter(en -> en.getValue() > 1)
		.map(Map.Entry::getKey)
		.collect(Collectors.toList())
		.forEach(str -> System.out.println(str));
		
		dub.stream().sorted(Comparator.reverseOrder())
		.distinct()
		.skip(1)
		.findFirst()
		.ifPresent(System.out::println);
		System.out.println("==============");
		
		dub.stream().sorted()
		.distinct()
//		.filter(n -> n > 7)
		.dropWhile(n -> n < 7)
		.forEach(System.out::println);
		
	}

	

}
