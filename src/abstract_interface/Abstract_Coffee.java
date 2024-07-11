package abstract_interface;

// 추상 메소드를 가지고 있는 클래스 = 추상 클래스
// 추상 클래스는 객체 생성이 불가능하다. (미완성 클래스이기 때문에)

public abstract class Abstract_Coffee {
	
//	Coffee 클래스를 상속 받는 모든 클래스들이 info() 메소드를 사용할 수 있도록 추가한 메소드
//	본문이 불필요한 메소드 (실행이 아닌 호출을 위한) -> 본문이 없는 추상 메소드로 만들 수 있다.
	public abstract void info();

}
