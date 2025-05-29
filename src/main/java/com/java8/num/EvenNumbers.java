package com.java8.num;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {
	
	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		List<Integer> lstnum = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
		
//		lstnum.stream().filter(num -> num%2 == 0).map(Integer::intValue).forEach(System.out::println);
		
		List<Integer> collect = Arrays.stream(nums).boxed().filter(num -> num%2 == 0).collect(Collectors.toList());
		System.out.println(collect);
//		forEach(System.out::println);
		
//		nums.stream().filter(num -> num%2 == 0).forEach(System.out::println);
		
//		lstnum.stream().filter(num -> num%2 == 0).forEach(System.out::println);
		
		List<Integer> loutnum =lstnum.stream().filter(num -> num%2 == 0).collect(Collectors.toList());
		
		System.out.println(loutnum);
		
	}

}
