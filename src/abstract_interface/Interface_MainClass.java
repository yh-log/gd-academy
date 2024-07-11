package abstract_interface;

public class Interface_MainClass {

	public static void main(String[] args) {

		Interface_MemberService memberService = new Interface_MemberServiceImpl();
		
//		추상 메소드
		memberService.login(); // MemberService 인터페이스에 있는 login() 메소드를 호출하지만 인터페이스에는 몸체가 없기 때문에 오버라이드된 메소드를 찾아 호출한다.
		memberService.logout();
		
//		디폴트 메소드
		memberService.method1();
		
		/*
		 * 인터페이스가 아니면 아래 방법으로도 호출 가능 
		 * memberService.method2();
		 */
		
//		정적 메소드 (객체가 아닌 클래스로 부른다.)
		Interface_MemberService.method2();
	
	}

}
