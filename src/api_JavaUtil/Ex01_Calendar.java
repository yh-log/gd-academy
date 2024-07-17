package api_JavaUtil;

import java.util.Calendar;

public class Ex01_Calendar {

	public static void main(String[] args) {

		exam();
		
	}

	public static void exam() {
		Calendar cal = Calendar.getInstance();
		
		int sum = 0;
		
		for(int month = 0; month < 12; month++) {
			
			cal.set(2024, month, 1); // 2024년 매월 1일을 설정
			
			int dayofweek = cal.get(Calendar.DAY_OF_WEEK);
			
			sum += dayofweek;
			
		}
		System.out.println(sum);
		
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
	}
	
}

//  1번 풀이
 
//			LocalDate date = LocalDate.of(2024, month, 1); // 2024년 각 월의 1일 구하기
//			System.out.println(date);

//			DayOfWeek daynumbers = date.getDayOfWeek(); // 매월 1일의 요일 구하기
//			System.out.println(daynumbers);

//			int day = daynumbers.getValue(); // 요일의 번호 구하기
//			System.out.println(day);

//			day = (day % 7) + 1; // 시스템에서는 월요일이 1이기 때문에 문제에 맞춰 일요일을 1로 수정

//			sum  += day;