package api_Javalang;

/*
https://pre.goodee.co.kr/member/myclassroom?memno=40&classno=2&orderno=1#totalviewarea
제시된 자리수로 반올림하거나 절사하여 결과를 출력하시오.
*/

public class Ex04_MathClass {
	

	public static void main(String[] args) {
		
		exam();
	}

	public static void exam() {
		  double num = 3.5162;
		  
		  System.out.println(Ex04_MyMath.round(num, 1));
		  System.out.println(Ex04_MyMath.round(num, 2));
		  System.out.println(Ex04_MyMath.round(num, 3));
		  System.out.println(Ex04_MyMath.floor(num, 1));
		  System.out.println(Ex04_MyMath.floor(num, 2));
		  System.out.println(Ex04_MyMath.floor(num, 3));
	}
	
}
