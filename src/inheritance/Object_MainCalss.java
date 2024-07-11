package inheritance;

public class Object_MainCalss {

	public static void main(String[] args) {

		
//		1. Object 타입으로 업캐스팅 (최상위 클래스이기 때문에 업캐스팅이 가능하다.)
		Object car1 = new Object_Car("자동차");

//		Object 타입으로 저장된 객체는 다운캐스팅해서 사용한다.
		if(car1 instanceof Object_Car) {
			System.out.println(((Object_Car)car1).getModel());
		}
		
//		2. Object 클래스의 toString() 메소드
		System.out.println(car1);
		System.out.println(car1.toString());
	
//		3. Object 클래스의 equals() 메소드
		Object_Car car2 = new Object_Car("자동차");
		Object_Car car3 = new Object_Car("자동차");
		
//		물리적 관점 : 다른 자동차 (Object 클래스의 equals() 메소드)
//		논리적 관점 : 같은 자동차 (같은 모델)
		
		System.out.println(car2.equals(car3));
		
	}

}
