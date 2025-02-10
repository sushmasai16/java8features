package com.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.stream.Stream;

public class Java8DateAndTime {

	public static void main(String[] args) {
		ZoneId z = ZoneId.of("America/Sao_Paulo");
		ZonedDateTime dd = ZonedDateTime.now(z);
		System.out.println("xone dd and time : "+dd);
		LocalDate locd = LocalDate.now(z);
		
		System.out.println("date : "+locd.getYear());
		
		LocalTime tm = LocalTime.now(z);
		System.out.println("time : "+tm);
		
		LocalDateTime dt = LocalDateTime.now(z);
		System.out.println("dt xxx : "+dt);
		LocalDateTime dt1 = LocalDateTime.now();
		System.out.println("dt : "+dt1);
		
		int y = 2021;
		
		Year year = Year.of(y);
		
		if(year.isLeap()){
			System.out.println("leap year : "+y);
		} else {
			System.out.println("not leap year : "+y);
		}
		
		
		Stream.iterate(1, i -> i <=10, i -> i+2).forEach(g -> System.out.println("ff : "+g));
		
		Stream.iterate(1,  i -> i+2).forEach(g -> System.out.println("ff : "+g));
		
		
	}

}
