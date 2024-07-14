package collection_framework;

/*
https://pre.goodee.co.kr/member/myclassroom?memno=40&classno=2&orderno=1#totalviewarea
숫자 100을 2, 8, 16진수로 변경하여 출력하시오.
*/

public class Ex01_WrapperClass {

	public static void main(String[] args) {

		exam();
		
	}
	
	public static void exam() {
		
		int num = 100;
		
		String x = Integer.toBinaryString(num); // 가변 길이를 표현하기 위해 String 사용
		System.out.println(x);
		
		String y = Integer.toOctalString(num);
		System.out.println(y);
		
		String z = Integer.toHexString(num);
		System.out.println(z);
		
	}

}
