package collection_framework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_MainClass {

	public static void main(String[] args) {

//		Map<K, V> 인터페이스로 타입 선언
		Map<String, Integer> map;
		
//		HashMap<K, V> 클래스 객체 생성
		map = new HashMap<String, Integer>();
		
//		Entry<K, V>(Key와 Value의 조합)
		map.put("국어", 80);
		map.put("영어", 90);
		map.put("수학", 100);
		map.put("국어", 100);
		
//		Key는 중복 x 순서 x => 중복 시 Value 값이 바뀐다.
//		확인
		System.out.println(map);
		
//		Value 확인
		System.out.println(map.get("국어"));
		
//		순회 1) Key를 기준으로 순회하기
		Set<String> set = map.keySet();
		for(String subject : set) {
			System.out.println(subject + ":" + map.get(subject));
		}
		
//		순회 2) Entry 단위로 순회하기 (추천!)
		for(Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
	}

}
