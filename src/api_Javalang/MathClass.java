package api_Javalang;

public class MathClass {

	public static void main(String[] args) {

//		Math 클래스 (static으로 만들어져 있어서 객체 생성 x)
		
		System.out.println("절대값: " + Math.abs(-10));
		System.out.println("정수올림값: " + Math.ceil(1.1));
		System.out.println("반올림: " + Math.round(1.5));
		System.out.println("정수내림값: " + Math.floor(1.9));
		System.out.println("제곱: " + Math.pow(2, 2.5));
		System.out.println("제곱근(루트): " + Math.sqrt(25));
		
//		난수
		double a = Math.random(); // 0.0 ~ 1.0 사이 0.0 <= a < 1.0
		System.out.println(a);
		
//		난수값을 원하는 특정범위 값으로 변환하기
		System.out.println(a * 6); // 6.0 보다 작은 값
		System.out.println(a * 6 + 1); // 1.0 <= a < 7.0 보다 작은 값
		System.out.println((int) (a * 6 + 1)); // 1 <= a < 7 보다 작은 값 -> 주사위
		
		
	}

}
