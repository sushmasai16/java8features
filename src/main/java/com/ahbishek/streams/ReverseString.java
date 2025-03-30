package com.ahbishek.streams;

public class ReverseString {
	
	public static void main(String[] args) {
		
		
		String str = "sushma hi";
		System.out.println("input : "+str);
		StringBuilder strBuilder = new StringBuilder(str);
		
		str = strBuilder.reverse().toString();
		System.out.println("reverse : "+str);
		
	}

}
