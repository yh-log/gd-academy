package accessModifier;

/*
https://pre.goodee.co.kr/member/myclassroom?memno=40&classno=2&orderno=1#totalviewarea
객체를 생성해 info() 를 호출하여 아래 결과를 출력하시오.
[결과]
Heart:1(100,250)
Spade:2(50,80) 
*/

public class Ex01_Card {
	
	String kind;
	int number;
	
	static int width = 100;
	static int height = 250;
	
	public void info() {
		System.out.println(kind + ":" + number + "(" + width + "," + height + ")");
	}

}
