package com.ahbishek.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RepeatedNumbersandCount {
	
	
	
	
	public static void main(String[] args) {
		List<Integer> lisNum = Arrays.asList(1,2,3,4,2,3,2,4,5,5,5,5,6,7,1);
		Map<Integer, Long> collect = lisNum.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
		
		
		lisNum.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()))
		.forEach((key,value) -> {System.out.println(key +" "+value);});
		
		
		lisNum.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()))
		.entrySet()
		.forEach(entry ->System.out.println(entry.getKey()+" : "+entry.getValue()));
		
		Map<Integer, List<Integer>> collect2 = lisNum.stream().collect(Collectors.groupingBy(n -> n));
		
		collect2.forEach((key,value) -> {System.out.println(key +" - "+value);});
		
		
		
		
		
	}

}
