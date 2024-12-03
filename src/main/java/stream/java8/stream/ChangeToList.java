package stream.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ChangeToList {
	
	public static void main(String[] args) {
		
		
		int[] numls = {1,2,4,6,5,3,8};
//		Integer numls = {1,2,4,6,5,3,8};
//		List<Integer> nutols = new ArrayList<>(Arrays.asList(numls));
		
		List<Integer> nn = IntStream.of(numls).boxed().collect(Collectors.toList());
		System.out.println(nn);
		List<Integer> st = nn.stream().sorted().collect(Collectors.toList());
		
		System.out.println(st);
	}
	
	public static String name() {
		synchronized(ChangeToList.class) {
			
		}
		return "sushma";
	}

}
