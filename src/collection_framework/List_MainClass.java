package collection_framework;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class List_MainClass {

	public static void main(String[] args) {

//		List<E> 타입 선언
//		java.util.List<E> : 정식 명칭 -> import 처리 해줘야 함

//		import를 하지 않은 경우
//		java.util.List<String> seasons;
		
		List<String> seasons;
		
//		ArrayList<E> 객체 생성 (ArrayList는 배열의 크기에 상관 없이 사용이 가능하다.)
		seasons = new ArrayList<String>();
		
//		요소 추가
		seasons.add("봄");
		seasons.add("여름");
		seasons.add("가을");
		seasons.add("겨울");
		
//		요소 찾기
		if(seasons.contains("겨울")) {
			System.out.println("겨울이 있다.");	
		}		
		
//		요소 삭제
		seasons.remove(0); // 봄 삭제
		seasons.remove(0); // 여름 삭제
		
//		공백 검사
		if(seasons.isEmpty()) {
			System.out.println("비어있다.");
		} else {
			System.out.println("비어있지 않다.");
		}
		
//		요소가져오기
		System.out.println(seasons.get(0));
		System.out.println(seasons.get(1));
		
//		길이 확인
		System.out.println(seasons.size());
		
//		초기화를 이용한 ArrayList 생성 (= 수정 불가)
		List<String> sports = Arrays.asList("수영", "골프", "스키");
		
//		for문을 이용한 ArrayList 순회
		for(int i = 0, size = sports.size(); i < size; i++) { // size 메소드를 여러번 호출하지 않고, size를 한번 구하면 그 값으로 활용하는 방법(더 효율적)
			System.out.println(sports.get(i));
		}
		
	}

}
