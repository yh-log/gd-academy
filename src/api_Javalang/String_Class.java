package api_Javalang;

public class String_Class {

	public static void method1() {
//		문자열 리터럴 (동일한건 하나만 저장)
		String str1 = "my";
		String str2 = "my";
		System.out.println(str1 == str2); // 문자열이 아닌 위치 정보가 동일한지 확인
		
		String str3 = new String("my");
		String str4 = new String("my");
		System.out.println(str3 == str4);
	}
	
	public static void method2() {
		String str1 = "My";
		String str2 = new String("my");
		System.out.println(str1.equals(str2)); // 문자열 자체를 비교
		System.out.println(str1 == str2);
		System.out.println(str1.equalsIgnoreCase(str2)); // 대소문자 무시하고 비교
	}
	
	public static void method3() {
		String str1 = " ";
		String str2 = "";
		
//		글자수
		System.out.println(str1.length()); // 스페이스도 글자수로 포함된다.
		System.out.println(str2.length());
		
//		글자수 검사 : 글자수가 0이면 true 아니면 false
		System.out.println(str1.isEmpty());
		System.out.println(str2.isEmpty());
		
//		공백문자 검사 : 공백문자로 구성되어 있으면 true
		System.out.println(str1.isBlank());
		System.out.println(str2.isBlank());
		
	}
	
	public static void method4() {
//		특정 문자열 찾기
		String str = "abc.abc.abc";
		
		System.out.println(str.indexOf(".")); // 발견된 첫 번째 인덱스를 반환한다.
		
		System.out.println(str.lastIndexOf(".")); // 마지막에 위치한 인덱스를 반환한다.
	
	}
	
	public static void method5() {
		String str = "hello world";
		
//		필요한 문자열이 한 글자일 경우 charAt() 사용
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(str.length() -1)); // 마지막 인덱스는 length -1 로 찾는다.
		
//		여러개의 요소를 찾아서 사용할 경우
		int space = str.indexOf(" "); // 공백문자의 인덱스 값 찾기
		
//		hello 가져오기
		System.out.println(str.substring(0, space)); // 0은 포함 space는 불포함
		
//		world 가져오기
		System.out.println(str.substring(space + 1));
	}

	public static void method6() {
//		포함 여부 찾기
		String str = "abcdefg";
		
		System.out.println(str.startsWith("a")); // 지정한 문자열로 시작하면 true
		
		System.out.println(str.endsWith("fg")); // 지정한 문자열로 끝나면 true
		
		System.out.println(str.contains("cd")); // 지정한 문자열을 포함하고 있으면 true
		
	}
	
	public static void main(String[] args) {

//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
		method6();
		
		
	}

}
