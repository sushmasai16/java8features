package stream.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {
	
	public static void main(String[] args) {
		
		String str[] = {"1","2","1","4","6"};
		
//		String strOutput = "{1},{2},{3},{4}";
		String strOutput = "";
		
		ArrayList<String> strArr = new ArrayList<String>(Arrays.asList(str));
		
//		strArr.forEach(s -> (strOutput = strOutput +"{"+s +"},"));
		
		for(String s : strArr) {
			strOutput = strOutput+"{"+s+"},";
		}
		strOutput = strOutput.substring(0, strOutput.length()-1);
		System.out.println("out put : "+strOutput);
		
		String stout = Arrays.stream(str).map(s -> "{"+s+"}").collect(Collectors.joining(","));
		System.out.println("stout put : "+stout);
		
		String stra = strArr.stream().map(s -> "{"+s+"}").collect(Collectors.joining(","));
		System.out.println("stra put : "+stra);
		
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("1", "v1");
		map.put("2", "v2");
		
		String strmp = map.entrySet().stream()
				
		.map(map1 -> map1.getKey() +"-"+map1.getValue())
		.skip(0)
		.collect(Collectors.joining(","));
		System.out.println("stra map1 : "+strmp);
		
		Map<String,String> strmap = map.entrySet().stream()
				.filter(map2 -> map2.getKey() != "1")
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
//				.map(map1 -> map1.getKey() +"-"+map1.getValue())
//				.collect(Collectors.joining(","));
		System.out.println("stra strmap : "+strmap);
	}

}
