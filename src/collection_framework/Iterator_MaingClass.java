package collection_framework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Iterator_MaingClass {

	public static void main(String[] args) {

//		배열 속 요소를 순회할 수 있다.(ArrayList는 for문으로 가능(인덱스가 있어서))
		
//		HashSet<E> 객체 생성
		Set<String> set = new HashSet<String>();
		
//		요소 추가
		set.add("국어");
		set.add("수학");
		set.add("과학");
		set.add("역사");
		set.add("영어");
		
//		iterator(반복자) 타입 객체 생성 ( Iterator<E> )
		Iterator<String> itr  = set.iterator();
		
//		hasNext() : 요소가 있으면 true 반환
//		next() : 요소를 가져오기
		while(itr.hasNext()) {
			String subject = itr.next();
			System.out.println(subject);
		} 
		
		List<String> list = new ArrayList<String>();
		
		list.add("안녕");
		list.add("hi");
		list.add("hello");
		
		Iterator<String> itr2 = list.iterator();
		
		while(itr2.hasNext()) {
			String subject2 = itr2.next();
			System.out.println(subject2);
		}
	
	}

}
