package class_method;

public class Parameter_Main {
	
	// 같은 클래스의 메소드 호출 : 메소드()
	
	// 메소드 호출 시 전달되는 값 : 매개변수, Parameter
	
	void method1(int number) {
		System.out.println(number);
	}
	
	void method2(String str) {
		System.out.println(str);
		}
	
	void method3(double number) {
		method4(number);
		
	}
	
	void method4(double number) {
		System.out.println(number);
		
	}
	
	void method5(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

	// 가변 매개변수 : 전달되는 인자 개수가 정해지지 않은 경우
	// 가변 매개변수는 배열이다.
	void method6(String... params) {
		for(int i = 0; i < params.length; i++) {
			System.out.println(params[i]);
			
		}
	}

}
