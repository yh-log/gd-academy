package api_JavaUtil;

import java.util.UUID;

public class Uuid_MainClass {

	public static void main(String[] args) {

//		UUID : Universally Unique IDentifier (범용 고유 식별자)
//		12345678-1234-1234-1234-123456789123 (총 36글자로 되어있는 식별자)
		
//		유효 아이디 값이 존재할 때, 아이디 값을 알고 있을 때 전달하는 것
		UUID uuid1 = UUID.fromString("12345678-1234-1234-1234-123456789012");
		System.out.println(uuid1);
		
//		이름에 따른 생성 : UUID version 3 (전달 이름이 같으면 아이디도 동일)

//		byte 배열 만들기
		String name = "tom";
		byte[] b = name.getBytes(); // String을 byte 배열로 바꾸어주는 메소드
		
		UUID uuid2 = UUID.nameUUIDFromBytes(b);
		System.out.println(uuid2);
		
//		난수에 따른 생성 : UUID version 4 (가장 추천하는 방법)
		UUID uuid3 = UUID.randomUUID();
		System.out.println(uuid3); // 실행할 때마다 바뀜
		
//		UUID -> String (보통 바꿔서 사용해준다. *범용적으로 사용하기 편리해진다.)
		System.out.println(uuid3.toString());
		
	}

}
