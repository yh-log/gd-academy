package class_method;

/*
https://pre.goodee.co.kr/member/myclassroom?memno=40&classno=2&orderno=1#totalviewarea
add 메소드를 오버로딩해 다음 결과를 출력하시오.
[결과]
10+20=30
10.5+20.3=30.8
*/

public class Ex04_MainClass {

	public static void main(String[] args) {

		exam();
		
	}
	
	public static void exam() {
		  Ex04_Adder adder = new Ex04_Adder();
		  adder.add(10, 20);
		  adder.add(10.5, 20.3);
	}

}
