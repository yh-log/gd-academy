package api_Javalang;

/*
https://pre.goodee.co.kr/member/myclassroom?memno=40&classno=2&orderno=1#totalviewarea
"~!@#$%^&*()" 을 제거하고 나머지 문자를 출력하시오.
*/	 

public class Ex03_StringBuilder {

	public static void main(String[] args) {

		exam();
		
	}
	
	public static void exam() {
		String str = "(1!2@3^4~5)(!@#$%12345678$%^&bcdefg)";
		String delChar = "~!@#$%^&*()";
		
		String regex = "[" + delChar + "]"; // [ ] 문자 클래스는 대괄호 안에 포함된 문자 중 하나와 일치하는 패턴을 의미한다.
											// 즉 [abc] 는 a, b, c 중 하나와 일치한다.
		
		String result = str.replaceAll(regex, ""); // regex에 해당하는 모든 문자열을 공백으로 변환
		
		System.out.println(result);
		
		
	}

}
