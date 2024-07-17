package api_JavaUtil;

import java.util.Optional;

public class Optional_MainClass {
	
	public static int getValue1(String str) {
		int value = 0;
		
//		null인 경우 0을 반환
		if(str != null) { 
			value = Integer.parseInt(str);
		}
		return value;
	}
	
	public static int getValue2(String str) {
		Optional<String> opt = Optional.ofNullable(str);
		return Integer.parseInt(opt.orElse("0"));
	}

	public static void main(String[] args) {

//		Optional<T> 클래스 : null 처리를 위한 방법을 제공하는 클래스
		
//		null이 없는 경우 사용법
		Optional<String> opt1 = Optional.of("hello"); // hello 문자열을 감싼 상태
		System.out.println(opt1.get());
		
//		null이 있는 경우 사용법
		Optional<String> opt2 = Optional.ofNullable(null);
		System.out.println(opt2.orElse("값이 없습니다."));
	
		
		System.out.println(getValue1("100"));
		System.out.println(getValue1(null));
		
		
		System.out.println(getValue2("100"));
		System.out.println(getValue2(null));
		
	}

}
