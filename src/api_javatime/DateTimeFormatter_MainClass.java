package api_javatime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;

public class DateTimeFormatter_MainClass {

	public static void main(String[] args) {

//		DateTimeFormatter 클래스
		
//		LocalDateTime 객체 선언 및 생성
		LocalDateTime dateTime = LocalDateTime.now();
		
//		DateTimeFormatter 객체 선언 및 생성
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
//		패턴이 적용된 날짜/시간
		String str = dtf.format(dateTime);
		
		System.out.println(str);
		
//		TemporalAccessor 인터페이스 타입 날짜/시간
		TemporalAccessor ta = dtf.parse(str);
		
		System.out.println(ta);
		
//		년,월,일,시,분,초 가져오기
		int year = ta.get(ChronoField.YEAR);
		int month = ta.get(ChronoField.MONTH_OF_YEAR);
		int day = ta.get(ChronoField.DAY_OF_MONTH);
		int hour = ta.get(ChronoField.HOUR_OF_DAY);
		int minute = ta.get(ChronoField.MINUTE_OF_HOUR);
		int second = ta.get(ChronoField.SECOND_OF_MINUTE);
		
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		
	}

}
