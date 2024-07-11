package inheritance;

public class Polymorphism_ParkingLot {
	
	private Polymorphism_Car[] carList = new Polymorphism_Car[3];
	private int count; // 필드로 만들었기 때문에 자동으로 0으로 초기화 된다.
	
	// 업캐스팅을 활용 -> 하나의 코드로 여러가지를 사용할 수 있는 다형성
	public void in(Polymorphism_Car car) {  // Car car = new EV()/FuelCar
		if(count == carList.length) {
			System.out.println("만차");
			return;
		}
		carList[count] = car;
		count++;
		car.parking();
		
/*		
		업캐스팅을 할 경우 부모가 가진 것만 사용할 수 있기 때문에 별도 처리 진행
		아래 방법으로도 해결 가능함
		if(car instanceof _EV) {
			((_EV) car).parking();
		}
		if(car instanceof _FuelCar) {
			((_FuelCar) car).parking();
		}
		}
	
*/	
	/* 오버라이드를 활용해서도 해결할 수는 있다.
	 * public void in(_EV ev) {
	 * 
	 * }
	 * 
	 * public void in(_FuelCar frelCar) {
	 * 
	 * }
	 * 
	 */
}
}
