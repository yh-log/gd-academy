package constructor;

public class This_02 {

	public static void main(String[] args) {

		// This_01 객체 생성
		This_01 this01 = new This_01();
		
		// this01 객체 확인
		System.out.println(this01);
		
		
		// this 확인
		this01.method();
		
		// setName 호출
		this01.setName("뽀로로");
		
		// levelUp 호출
		this01.levelUp().levelUp().levelUp();
		System.out.println(this01.level);
	}

}
