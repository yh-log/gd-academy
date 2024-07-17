package inheritance;

/*
https://pre.goodee.co.kr/member/myclassroom?memno=40&classno=2&orderno=1#totalviewarea
"홍길동,25" 가 나오도록 Object 클래스의 toString() 메소드를 오버라이딩하시오.
*/

public class Ex01_Object_MainClass {

	public static void main(String[] args) {

		exam();
		
	}
	
	public static void exam() {
		Ex01_Object_Person p = new Ex01_Object_Person("홍길동", 25);
		System.out.println(p);
	}

}
