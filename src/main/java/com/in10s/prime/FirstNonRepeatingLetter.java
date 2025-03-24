package com.in10s.prime;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeatingLetter {
	
	public static void main(String[] args) {
		String num = "sushma u  r here";
		
		Character result = num.chars()
		.mapToObj(c -> (char) c)
		.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new ,Collectors.counting()))
		.entrySet()
		.stream()
		.filter(e -> e.getValue() == 1)
		.map(Map.Entry::getKey)
		.findFirst()
		.orElse(null);
		System.out.println("charater : "+result);
	}

}
