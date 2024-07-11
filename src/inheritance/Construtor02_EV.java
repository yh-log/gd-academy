package inheritance;

public class Construtor02_EV extends Constructor01_Car{
	
	// 부모 클래스가 생성자를 가진 경우에는
	// 자식 클래스의 생서자에서 부모 클래스의 생성자를 반드시 호출해야 한다.
	//	(자식을 만들기 위해서는 "반드시" "먼저" 부모를 먼저 만들어야 한다.)
	
	private int battery;
	
	public Construtor02_EV(String model, int bettery) {
		super(model);  // Car(String model) 생성자가 호출된다.
		this.battery = bettery;
		}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}
	
	
}

