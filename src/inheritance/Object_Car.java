package inheritance;

import java.util.Objects;

public class Object_Car {
	
	// extends 키워드가 없는 클래스는 모두 자동으로 Object 클래스를 상속 받는다.
	
	private String model;

	// 생성자 만들기
	public Object_Car(String model) {
		super(); // Object의 생성자를 부르는 부분 (생략해도 괜찮음)
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
//	 2. Object 클래스의 toString() 메소드 오버라이드
// 
//	 @Override 
//	 public String toString() { 
//	 return "모델: " + model; 
//	 }
	 

	// 이클립스가 자동으로 만들어주는 오버라이드
	@Override
	public String toString() {
		return "_Car [model=" + model + "]";
	}


	
//	3. Object 클래스의 equals() 메소드 오버라이드
//	@Override
//	public boolean equals(Object obj) { // obj = car3(인자값)
//		// 문자열 동등 비교는 == 연산자가 아니다.
//		// 문자열 동등 비교는 equals() 메소드로 한다.
//		
//		return model.equals(((_Car)obj).getModel()); // 여기서 model은 car2 파라미터는 car3이다.
//	}
	
//	이클립스가 만들어주는 equals 재정의
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Object_Car other = (Object_Car) obj;
		return Objects.equals(model, other.model);
	}	

	
	

}
