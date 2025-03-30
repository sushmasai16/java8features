package com.ahbishek.streams;

import java.util.stream.IntStream;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		IntStream.iterate(2, i-> i <= 11,i -> i+1)
		
		.filter(PrimeNumber::primeNumber)
		//.limit(10)
		.forEach(System.out::println);
		
		
		IntStream.iterate(2, i -> i <=11, i -> i+1)
//		IntStream.iterate(2, i -> i+1)
		.filter(num -> {
			return IntStream.range(2, num)
			.allMatch(n -> num%n !=0);
			
		})//.limit(10)
		.forEach(System.out::println);
		
	}
	
	private static boolean primeNumber(int num) {
		
		return IntStream.range(2, num)
		.allMatch(n -> num%n !=0);
		
	}
	
	
	
	
	

}
