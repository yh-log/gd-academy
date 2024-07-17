package api_JavaUtil;

/*
https://pre.goodee.co.kr/member/myclassroom?memno=40&classno=2&orderno=1#totalviewarea
null일 경우 홍길동 을 반환하도록 getName()을 구성하시오
*/

import java.util.Optional;

public class Ex02_Optional {
	

	public String getName(String name) {
		
		return Optional.ofNullable(name).orElse("홍길동");
	
	}
	
	
	public static void main(String[] args) {

		exam();
		
	}
	
	public static void exam() {
		Ex02_Optional p = new Ex02_Optional();
		System.out.println(p.getName(null));
		System.out.println(p.getName("이몽룡"));
	}

}
