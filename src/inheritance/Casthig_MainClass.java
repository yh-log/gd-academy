package inheritance;

public class Casthig_MainClass {

	public static void main(String[] args) {
		
		// 업캐스팅 : 자식 객체를 부모 타입으로 바꿀 수 있다.
		Casting_Car ev = new Casting_EV();
		Casting_Car fuelCar = new Casting_FuelCar();
		
		// 부모 클래스가 가진 메소드만 호출할 수 있다.
		ev.forware();
		ev.reverse();
		
		fuelCar.forware();
		fuelCar.reverse();
		
		// 다운캐스팅 : 부모 타입의 객체를 자식 타입으로 바꿀 수 있다.
		((Casting_EV)ev).charging();
		((Casting_FuelCar)fuelCar).addFuel();
		
		// *주의* 다운캐스팅은 Exception이 발생할 가능성이 있다. (문법체크가 이뤄지지 않음)
//		((Casting_FuelCar)ev).addFuel();
		
		// 타입 확인 연산자 : instanceof 연산자
		// 위 방법 처럼 다운캐스팅을 하지 않아도 문법 체크를 해주었기 때문에 다운캐스팅이 가능하다.
		if(ev instanceof Casting_EV) {
			((Casting_EV) ev).charging();
		}
		
		if(fuelCar instanceof Casting_FuelCar) {
			((Casting_FuelCar) fuelCar).addFuel();
		}
	}

}
