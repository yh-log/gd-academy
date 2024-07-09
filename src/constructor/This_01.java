package constructor;

public class This_01 {
	
	/* this
	 * 1. 메소드를 호출한 객체를 의미한다.
	 * 2. 활용 방법
	 * 		a. 필드와 매개변수를 구분하는 용도
	 * 		b. 메소드 체이닝을 구현하는 용도
	*/	
	
	// this 확인
	void method() {
		System.out.println(this);
	}
	
	// field
	String name;
	int level;
	
	// name을 저장하는메소드
	void setName(String name) {
		this.name = name; // 매개변수와 필드값이 동일한 경우 this로 구분한다.
		
	}
	
	// level을 올리는 메소드
	This_01 levelUp() {
		level++;
		return this;
	}
	
	
	
	
	
	

}
