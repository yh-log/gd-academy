package api_Javalang;

public class String_Builder {

	public static void main(String[] args) {

//		StringBuilder 클래스 : 문자열을 연결시켜 줄 때 주로 사용한다. (메모리를 효율적으로 사용)
		
		
//		선언 및 생성
		StringBuilder sb; // 객체 선언
		sb = new StringBuilder(); // 객체 생성
		
//		문자열 추가
		sb.append("hello");
		sb.append("world");
		sb.append("nice").append("to").append("meet").append("you"); // append는 메소드 체이닝이 가능함
		
//		확인
		System.out.println(sb);
		
//		String 클래스 타입으로 변환하는 과정이 필요하다.
		System.out.println(sb.toString()); // 방법 1
		System.out.println(new String(sb)); // 방법 2
		
		
	}

}
