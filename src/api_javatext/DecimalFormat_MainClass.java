package api_javatext;

import java.text.DecimalFormat;

public class DecimalFormat_MainClass {

	public static void main(String[] args) {

//		DecimalFormat 클래스 : 숫자에 원하는 패턴을 지정
		
//		Pattern
//		       0 : 천 단위 구분 기호 없음
//		   #,##0 : 천 단위 구분 기호 있음 
//		    0.00 : 천 단위 기호 없음 + 소수부 2자리
//		#,##0.00 : 천 단위 구분 기호 있음 + 소수부 2자리
		
//		DecimalFormat 객체 생성 및 선언
		DecimalFormat df = new DecimalFormat("#,##0.00");
		
		
//		숫자
		long number = 123456789123L;
		
//		Pattern 적용 문자열
		String str = df.format(number);
		
		System.out.println(str);
		
//		Pattern 적용 문자열 -> 숫자로 (예외처리가 반드시 필요하다.)
		try {
			Number n =  df.parse(str); // Number 클래스
			long result = n.longValue(); // n을 long 타입으로 변환하는 메소드
			System.out.println(result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
