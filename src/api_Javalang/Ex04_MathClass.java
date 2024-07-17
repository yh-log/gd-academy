package api_Javalang;

/*
https://pre.goodee.co.kr/member/myclassroom?memno=40&classno=2&orderno=1#totalviewarea
제시된 자리수로 반올림하거나 절사하여 결과를 출력하시오.
*/

public class Ex04_MathClass {
	
	public void round(double a, int b) {
		
	}
	
	public void floor(double a) {
		
	}

	public static void main(String[] args) {
		
		  double num = 3.5162;
		  System.out.println(Ex04_MathClass.round(num, 1));
		  System.out.println(Ex04_MathClass.round(num, 2));
		  System.out.println(Ex04_MathClass.round(num, 3));
		  System.out.println(Ex04_MathClass.floor(num, 1));
		  System.out.println(Ex04_MathClass.floor(num, 2));
		  System.out.println(Ex04_MathClass.floor(num, 3));

	}

}
