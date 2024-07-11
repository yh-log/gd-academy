package abstract_interface;

// 추상 클래스 = 상속 받는다.
// 인터페이스 = 구현한다. (= 구현클래스)

public class Interface_MemberServiceImpl implements Interface_MemberService{
	
	// 반드시 추상 메소드를 오버라이드 해야한다.
	
	@Override
	public void login() {
		System.out.println("로그인");
	}
	
	@Override
	public void logout() {
		System.out.println("로그아웃");
	}

}
