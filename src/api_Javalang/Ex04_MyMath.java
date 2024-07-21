package api_Javalang;

/*
https://pre.goodee.co.kr/member/myclassroom?memno=40&classno=2&orderno=1#totalviewarea
제시된 자리수로 반올림하거나 절사하여 결과를 출력하시오.
*/

public class Ex04_MyMath {
	
	
	public static double round(double a, int b) {
		
		
//		1. int b에 들어온 숫자만큼 10의 제곱을 해준다
		double scale = Math.pow(10, b); // 10의 b 제곱
		
		System.out.println(scale);
		
//		2. double a 값에 scale(제곱된 10의 값) 을 곱해서 소수점을 이동시키고
//		   반올림한 후 다시 소수점을 옮겨준다.
		return Math.round(a * scale) / scale; // 반올림
		
	
	} 
	
	public static double floor(double a, int b) {
		
		double scale = Math.pow(10, b);
		
		return Math.floor(a * scale) / scale; // 내림
		
	}
	

}
