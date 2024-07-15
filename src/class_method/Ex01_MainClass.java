package class_method;

/*
https://pre.goodee.co.kr/member/myclassroom?memno=40&classno=2&orderno=1#totalviewarea
내용이 없는 Card 클래스를 이용해 객체를 생성하고, null이 아니면 "객체생성완료" 메시지를 출력하시오.abstract
*/

public class Ex01_MainClass {

	public static void main(String[] args) {

		exam();
		
	}
	
	public static void exam() {
		Ex01_Card card = new Ex01_Card();
		
		
		if(card != null) {
			System.out.println("객체생성완료");
		}
	}

}
