package class_method;

public class Return_Sub {

	public static void main(String[] args) {

		// Package 객체 생성
		Return_Main packages = new Return_Main();

		
		packages.method1(10);
		packages.method1(-10);
		
		
		int n = packages.method2(10);
		System.out.println(n);
	}


}
