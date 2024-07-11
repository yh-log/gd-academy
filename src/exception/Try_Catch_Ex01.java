package exception;

/*
https://pre.goodee.co.kr/member/myclassroom?memno=40&classno=2&orderno=1#totalviewarea
try-catch 문을 추가해 예외 메시지를 출력하시오.
*/

public class Try_Catch_Ex01 {

	public static void main(String[] args) {

		exam();
		
	}
	
	public static void exam() {
		
		try {
			String str1 = "1";
			String str2 = "2.5";
			int number1 = Integer.parseInt(str1);
			int number2 = Integer.parseInt(str2);
			System.out.println(number1 + number2);
	} catch(Exception e) {
		System.out.println(e.getMessage());
		
	}
	}

}
