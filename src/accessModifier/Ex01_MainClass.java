package accessModifier;

/*
https://pre.goodee.co.kr/member/myclassroom?memno=40&classno=2&orderno=1#totalviewarea
객체를 생성해 info() 를 호출하여 아래 결과를 출력하시오.
[결과]
Heart:1(100,250)
Spade:2(50,80) 
*/

public class Ex01_MainClass {

	public static void main(String[] args) {

		exam();
		
	}
	
	public static void exam() {
		
		Ex01_Card car1 = new Ex01_Card();
		Ex01_Card car2 = new Ex01_Card();
		
		car1.kind = "Heart";
		car1.number = 1;

		car1.info();
		
		car2.kind = "Spade";
		car2.number = 2;
		
		Ex01_Card.width = 50;
		Ex01_Card.height = 80;
		
		car2.info();
		
	}

}
