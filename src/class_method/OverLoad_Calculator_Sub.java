package class_method;

public class OverLoad_Calculator_Sub {
	
	/*
	 * 메소드 오버로드 1. 동일한 이름의 메소드가 2개 이상 존재할 수 있다. 2. 반드시 매개변수가 서로 다르게지정되어야 한다. (개수, 타입
	 * 중 하나만 다르게 지정되어도 된다.)
	 */
	
	public static void main(String[] args) {
	// Calculator 객체 생성
	OverLoad_Calculator_Main calculator = new OverLoad_Calculator_Main();
	
	// add 메소드
	calculator.add(1, 2);
	calculator.add(1, 2, 3);
	calculator.add(1, 2, 3, 4);
	calculator.add(1.5, 1.6);
	calculator.add(1.5, 1.6, 1.7);
	
	}

}
