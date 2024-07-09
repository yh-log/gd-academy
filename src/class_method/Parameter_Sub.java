package class_method;

public class Parameter_Sub {

	public static void main(String[] args) {
		
		// Parameter 타입의 parameter 객체 생성
		Parameter_Main parameter = new Parameter_Main();
		
		// 다른 클래스의 메소드 호출 : 객체.메소드()
		
		// 메소드 호출 시 전달하는 값 : 인자, 인수, Argument
		parameter.method1(10);
		
		parameter.method2("hello");
		
		parameter.method3(1.5);
		
		parameter.method5(new int[] {10, 20, 30});

		parameter.method6("고양이", "강아지");
		
		parameter.method6("사과", "배","복숭아");
	}

}
