package com.ahbishek.streams;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {
	
	public static void main(String[] args) {
		
		
		String str = "sushma hi";
		System.out.println("input : "+str);
		StringBuilder strBuilder = new StringBuilder(str);
		
		String strs = strBuilder.reverse().toString();
		System.out.println("reverse : "+strs);
		
		
		//
		String reverStrams = IntStream.range(0, str.length())
		.mapToObj(i -> str.charAt(str.length() - 1 - i))
		.map(String::valueOf)
		.collect(Collectors.joining());
		System.out.println("reverStrams : "+reverStrams);
		
		
		IntStream.range(0, 8)
		.forEach(n -> System.out.println(n+" "));
		
		
		IntStream.iterate(0, i -> i <= 20,i -> i+1)
		.limit(10)
		.forEach(n -> {
			System.out.println(n);
			});
		
		
		
		
		String str1 = "hisushma";
		
		String collect = IntStream.range(0, str1.length())
		.mapToObj(i -> str1.charAt(str1.length() - 1 - i))
		.map(String::valueOf)
		.collect(Collectors.joining())
		;
		
		System.out.println("rever : "+collect);
		
		
		
		String sentence = "hello sushma how are you";
		
		
		String collectsen = Arrays.stream(sentence.split(" "))
		.map(word -> new StringBuilder(word).reverse().toString())
		.collect(Collectors.joining(" "));
		
		
		System.out.println("collectsen : "+collectsen);
		
		
		
		String[] split = sentence.split(" ");
		
		
		
		String collect2 = IntStream.range(0, sentence.length())
		.mapToObj(i -> sentence.charAt(sentence.length() - 1 -i))
		.map(String::valueOf)
		.collect(Collectors.joining(""));
		
		System.out.println("collect2 : "+collect2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
