package inheritance;

public class Polymorphism_MainClass {

	public static void main(String[] args) {

		Polymorphism_ParkingLot parkingLot = new Polymorphism_ParkingLot();

		parkingLot.in(new Polymorphism_EV());
		parkingLot.in(new Polymorphism_EV());
		parkingLot.in(new Polymorphism_FuelCar());
		parkingLot.in(new Polymorphism_FuelCar()); // *배열을 3개까지 넣을 수 있지만 문법 체크를 안해주기 때문에오류가 안난다.
		
	}

}
