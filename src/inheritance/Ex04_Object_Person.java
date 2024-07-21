package inheritance;

/*
https://pre.goodee.co.kr/member/myclassroom?memno=40&classno=2&orderno=1#totalviewarea
"홍길동,25" 가 나오도록 Object 클래스의 toString() 메소드를 오버라이딩하시오.
*/

public class Ex04_Object_Person {
	
	private String name;
	private int age;
	
	public Ex04_Object_Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name + "," + age;
	}

	
}
