package api_JavaUtil;

import java.util.Scanner;

public class Scanner_MainClass {

	public static void main(String[] args) {

//		Scanner 클래스 : 입력 받는 클래스
		
		
//		객체 선언 및 생성
		Scanner sc = new Scanner(System.in); // System.in : 키보드를 통해 입력 받는
		
//		int 입력
		System.out.println("int 입력");
		int a = sc.nextInt();
		
//		long 입력
		System.out.println("long 입력");
		long b = sc.nextLong();
		
//		double 입력
		System.out.println("double 입력");
		double c = sc.nextDouble();
		
//		String 입력
		System.out.println("String 입력(공백 없이 입력)");
		String d = sc.next();

		sc.nextLine(); // 입력에서 불필요한 엔터를 없애는 방법1
		
//		공백이 포함된 String 입력
		System.out.println("String 입력(공백 포함 입력");
		String e = sc.nextLine(); // 엔터로 구분하기 때문에 직전 입력에서 누른 엔터가 저장될 수 있다.
		
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		sc.close(); // 스트림의 경우 사용 후 닫아주는 것이 좋다!
		
	}

}
