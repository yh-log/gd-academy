package collection_framework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Set_MainClass {

	public static void main(String[] args) {

//		Set<E> 인터페이스 타입 선언
		Set<String> hobbies;
		
		
//		HashSet<E> 클래스 객체 생성 = 순서 의미 x, 중복 x
		hobbies = new HashSet<String>();
		
//		요소 추가
		hobbies.add("걷기");
		hobbies.add("독서");
		hobbies.add("여행");
		hobbies.add("걷기");
		hobbies.add("독서");
		hobbies.add("여행");
		hobbies.add("걷기");
		hobbies.add("독서");
		hobbies.add("여행");

//		향상 for문 활용
		for(String hobby : hobbies) {
			System.out.println(hobby);
		}
		
		
//		초기화를 이용한 HashSet 생성
		Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1, 2, 3));
		Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(2, 3, 4));
		
		
//		교집합 -> 합집합 -> 차집합
//		set1.retainAll(set2);
//		set1.addAll(set2);
		set1.removeAll(set2);
		
		System.out.println(set1);
	}

}
