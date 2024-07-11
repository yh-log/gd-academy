package abstract_interface;

// 추상 클래스를 상속 받은 클래스는 -> 반드시 추상 메소드를 오버라이드 해야한다.

public class Abstract_Americano extends Abstract_Coffee{
	
	@Override
	public void info() {
		System.out.println("물과 커피");
	}

}
