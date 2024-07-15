package class_method;

/*
https://pre.goodee.co.kr/member/myclassroom?memno=40&classno=2&orderno=1#totalviewarea
begin 부터 end 사이 정수 중 짝수의 합을 반환하시오.
*/

public class Ex05_MainClass {

	public static void main(String[] args) {

		exam();
		
	}
	
	public static void exam() {
		Ex05_Calculator calc = new Ex05_Calculator();
		System.out.println(calc.getEvenTotal(1, 100));
	}

}
