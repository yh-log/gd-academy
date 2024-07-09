package constructor;

public class Constructor_01 {
	
	String id;
	
	// 생성자의 특징
	// 반환타입 : 존재하지 않는다.
	// 메소드명 : 클래스와 같은 이름이다.
	// 매개변수 : 일반 메소드와 동일하다.

	// 생성자를 만들지 않으면 기본 생성자가 만들어진다.
	Constructor_01() {
		System.out.println(id + "를 가진 객체 생성");
	}
	
	Constructor_01(String id) {
		this.id = id;
		System.out.println(this.id + "를 가진 객체 생성");
	}
	
}
