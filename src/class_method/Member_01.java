package class_method;

// public 클래스는 클래스의 이름과 파일의 이름이 같아야 한다. (이름을 바꿀 경우 코드가 아닌 파일명을 바꿔야 한다.)

public class Member_01 { 
	
	public static void main(String[] args) {
		
		// 클래스 - 데이터 타입 : Member
		// 객체 - 변수 : member1, member2
		
		// 객체 선언
		Member_01 member1;
		Member_01 member2;
		
		// 객체생성
		member1 = new Member_01();
		member2 = new Member_01();
		
		// 객체 확인
		System.out.println(member1);
		System.out.println(member2);
		
	}

}
