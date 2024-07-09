package class_method;

public class Return_Main {
	
	// 반환 없음 : void
	// 반환 있음 : int, long, double, boolean, ...
	
	// 반환 없는 경우와 return
	// return;  : 메소드 종료
	void method1(int a) {
		if(a < 0) {
			return;
		}
		System.out.println(a);
		
	}
	
	
	// 반환 있는 경우와 return
	int method2(int a) { // 반환값의 타입을 작성
		return a + 1;  // 반환값 a + 1
	}

}
