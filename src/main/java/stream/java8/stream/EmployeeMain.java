package stream.java8.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeMain {
	
	public static void main(String[] args) {
	
		EmployeeBO empBo = new EmployeeBO();
		
		ArrayList<EmployeeBO> empl = new ArrayList<>();
		
		empBo = new EmployeeBO();
		empBo.setName("sushma");
		empBo.setSalary(100);
		empl.add(empBo);
		
		empBo = new EmployeeBO();
		empBo.setName("yama");
		empBo.setSalary(50);
		empl.add(empBo);
		
		empBo = new EmployeeBO();
		empBo.setName("tanvi");
		empBo.setSalary(1100);
		empl.add(empBo);
		
		empBo = new EmployeeBO();
		empBo.setName("sri");
		empBo.setSalary(10);
		empl.add(empBo);	
		
		Integer num = empl.stream().
				map(EmployeeBO::getSalary).
				sorted((a,b)->b-a).
				skip(empl.size()-2)
				.findFirst()
				.orElse(null) ;
				System.out.println(num);
//				collect(Collectors.toList());
		
//		for (Iterator iterator = ls.iterator(); iterator.hasNext();) {
//			Integer integer = (Integer) iterator.next();
//			System.out.println(integer);
//			
//		}
				Integer numls = empl.stream().
						map(EmployeeBO::getSalary).
						sorted((a,b)->b-a)
						.skip(1)
						.findFirst()
						.orElse(null);
				System.out.println(numls);
//						.collect(Collectors.toList());
//		for (Integer integer : numls) {
//			System.out.println(integer);
//		}
	}

}
