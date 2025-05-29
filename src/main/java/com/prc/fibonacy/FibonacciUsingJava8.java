package com.prc.fibonacy;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FibonacciUsingJava8 {
	
	
	public static void main(String[] args) {
		
		//java 8
		Stream.iterate(new int[] {0,1}, n -> new int[]{n[1],n[0]+n[1]})
		.limit(10)
		.map(n -> n[0])
		.forEach(System.out::println);
		
		//java 9
//		Stream.iterate(new int[] {0,1},n -> n[0] < 10 , n -> new int[]{n[1],n[0]+n[1]})
//		.map(n -> n[0])
//		.forEach(System.out::println);
		
		
		IntStream.range(0, 10)
        .map(FibonacciUsingJava8::fib)
        .forEach(System.out::println);
		
		
	}
	
	 private static int fib(int n) {
	        if (n <= 1) return n;
	        return fib(n - 1) + fib(n - 2);
	    }

}
//Explanation:
//Stream.iterate() starts with [0,1].
//
//It generates a new pair [f[1], f[0] + f[1]], mimicking Fibonacci logic.
//
//.limit(10) restricts to the first 10 Fibonacci numbers.
//
//.map(f -> f[0]) extracts the first value of each pair.
//
//.forEach(System.out::println) prints the sequence.