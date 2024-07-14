package collection_framework;

public class Generic_MainClass {

	public static void main(String[] args) {

//		MyBox 객체 선언 및 생성
//		기본 자료형 x, 참조형만 사용 가능 (int (x) Integer (o))
		Generic_MyBox<String> myBox;
		
		myBox = new Generic_MyBox<String>();  // 객체를 생성할 때는 <> 안에 String를 생략할 수 있다.

		myBox.setItem("hello");
		System.out.println(myBox.getItem());
		
	}

}
