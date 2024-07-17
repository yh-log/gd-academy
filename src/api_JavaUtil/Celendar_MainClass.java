package api_JavaUtil;

import java.util.Calendar;
import java.util.Locale;

public class Celendar_MainClass {

	public static void main(String[] args) {

//		Calendar 클래스(추상클래스)
		
//		객체 생성 방법
		Calendar calendar = Calendar.getInstance(Locale.KOREA);
		
//		확인
		System.out.println(calendar);
		
//		타임스탬프 가져오기
		long timestamp = calendar.getTimeInMillis();
		System.out.println(timestamp);

//		특정 필드(년, 월, 일, 시, 분, 초) 가져오기
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH) + 1);
		
		
	}

}
