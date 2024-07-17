package api_Javalang;

/*
https://pre.goodee.co.kr/member/myclassroom?memno=40&classno=2&orderno=1#totalviewarea
숫자 형태의 문자열의 각 문자를 숫자로 변환한 후 합계를 출력하시오.
*/
	
public class Ex02_StringClass {

	public static void main(String[] args) {

		exam();
		
	}
	
	public static void exam() {
		String str = "12345";
		
		int sum = 0;
		
		for(int i = 0; i < str.length(); i++) {
			sum += Character.getNumericValue(str.charAt(i)); // 문자열을 숫자로 변환하는 메소드
		}

		System.out.println(sum);
	}

	
}
