package com.in10s.prime;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Primenumber {

	
	
	
	public static boolean isPrimeNumber(int num) {
		
		return IntStream.range(2, num-1)
		.allMatch(n -> num%n != 0);
		
	}
	
	public static void main(String[] args) {
		
		IntStream.rangeClosed(2, 100)
		.filter(Primenumber::isPrimeNumber)
		.boxed()
		.collect(Collectors.toList())
		.forEach(n -> System.out.println(" "+n));
		
	}
}
