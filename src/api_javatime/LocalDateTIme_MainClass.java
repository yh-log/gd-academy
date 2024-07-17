package api_javatime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTIme_MainClass {
	
	public static void method1() {
		
//		LocalDate 클래스
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(2023, 5, 5);
		LocalDate date3 = LocalDate.parse("2023-08-25");
		
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
	}
	
	
	public static void method2() {
//		LocalTime 클래스
		LocalTime time1 = LocalTime.now();
		LocalTime time2 = LocalTime.of(10, 30, 45);
		LocalTime time3 = LocalTime.parse("11:20:30");
		
		System.out.println(time1);
		System.out.println(time2);
		System.out.println(time3);
		
	}
	
	
	public static void method3() {
//		LocalDateTime 클래스
		LocalDateTime dateTime1 = LocalDateTime.now();
		LocalDateTime dateTime2 = LocalDateTime.of(2023, 10, 25, 9, 30, 45);
		LocalDateTime dateTime3 = LocalDateTime.parse("2023-06-20T10:30:45");
		
		System.out.println(dateTime1);
		System.out.println(dateTime2);
		System.out.println(dateTime3);
		
		
	}
	
	public static void method4() {
		LocalDateTime dateTime = LocalDateTime.of(2023, 8, 25, 10, 45, 30);
		
		int year = dateTime.getYear();
		int month = dateTime.getMonthValue();
		int day = dateTime.getDayOfMonth();
		int hour = dateTime.getHour();
		int minute = dateTime.getMinute();
		int second = dateTime.getSecond();
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		
	
	}
	
	public static void main(String[] args) {
		
		method1();
		method2();
		method3();
		method4();
		
		
	}

}
