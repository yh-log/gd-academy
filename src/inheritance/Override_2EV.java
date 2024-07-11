package inheritance;

public class Override_2EV extends Override_1Car{
	
	private int bettery;

	public Override_2EV(String model, int bettery) {
		super(model);
		this.bettery = bettery;
	}

	// <메소드 오버라이드>
	// 부모 클래스의 메소드를 자식 클래스는 사용할 수 있다.
	// 원한다면 부모 클래스의 메소드도 다시 만들어 사용할 수 있다.
	// 반드시 동일한 형태로 만들어야 한다. 
	// @Override -> java에게 오버라이드 한 메소드임을 알려주는 것 (문법체크를 해준다.)
	
	@Override
	public void forward() {
		System.out.println("전기차 앞으로");
	}
	
	@Override
	public void reverse() {
		System.out.println("전기차 뒤로");
	}
	
}
