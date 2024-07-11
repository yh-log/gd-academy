package inheritance;

public class Inherit03_MainClass {

	public static void main(String[] args) {

		// EV 객체 생성
		Inherit02_EV ev = new Inherit02_EV();
		
		ev.forward();
		ev.reverse();
		ev.setModel("전기차");
		System.out.println(ev.getModel());
	}

}
