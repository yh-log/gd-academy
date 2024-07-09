package constructor;
/*
https://pre.goodee.co.kr/member/myclassroom?memno=40&classno=2&orderno=1#totalviewarea
클래스를 생성해 클래스의 생성자를 오버로딩 하시오.*/

public class Ex_Main {
	
	String model;
	
	Ex_Main() {
		System.out.println("객체생성완료(모델:" + model + ")");
	}
	
	Ex_Main(String model) {
		this.model = model;
		System.out.println("객체생성완료(모델:" + this.model + ")");
	}

}

