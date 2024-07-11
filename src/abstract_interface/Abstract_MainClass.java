package abstract_interface;

public class Abstract_MainClass {

	public static void main(String[] args) {

//		Coffee 타입으로 형변환
		Abstract_Coffee coffee1 = new Abstract_Americano();
		Abstract_Coffee coffee2 = new Abstract_CafeLatte();
		
		coffee1.info();  // 물과 커피 
		coffee2.info();  // 우유와 커피
		
	}

}
