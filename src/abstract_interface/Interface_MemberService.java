package abstract_interface;

// 추상 클래스 : abstract class
// 인터페이스 : interface

public interface Interface_MemberService {
	
//	추상 메소드
	public abstract void login();
	public abstract void logout();
	
	
//	디폴트 메소드
	public default void method1() {
		System.out.println("디폴트 메소드");
	}
	
//	정적 메소드
	public static void method2() {
		System.out.println("정적 메소드");
	}
}
