package class_method;

/*
https://pre.goodee.co.kr/member/myclassroom?memno=40&classno=2&orderno=1#totalviewarea
다음 결과가 나오도록 Rectangle 클래스의 area(), length() 메소드를 완성하시오. 
[결과]
면적:100
둘레:가로10,세로10,둘레40
*/

public class Ex03_MainClass {

	public static void main(String[] args) {

		exam();
		
	}
	
	public static void exam() {
		  Ex03_Rectangle rectangle = new Ex03_Rectangle();
		  rectangle.area(10, 10);
		  rectangle.length(10, 10);
	}

}
