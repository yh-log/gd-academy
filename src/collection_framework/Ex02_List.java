package collection_framework;

/*
https://pre.goodee.co.kr/member/myclassroom?memno=40&classno=2&orderno=1#totalviewarea
ArrayList를 활용해 숫자들의 평균값과 중간값 출력
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex02_List {

	public static void main(String[] args) {

		exam();
		
	}
	
	public static void exam() {
		
		List<Integer> num;
		
		num = new ArrayList<Integer>();
		
		Collections.addAll(num, 10, 20, 50, 60, 30, 70, 25, 55, 60);

		
//		평균 구하기		
		int sum = 0;
		for(int i : num) {
			sum += i;
		}
		
		int avg = sum / num.size();
		System.out.println(avg);
		
//		중간값 구하기
//		값 정렬
		Collections.sort(num);  // 위에서 Collections로 해줘서 여기도 동일하게

//		정렬 되었는지 확인
//		System.out.println(num);
		
		int result = 0;
		int size = num.size();
		
		if(num.size() % 2 == 0) {
			result = (num.get(size / 2 - 1) + num.get(size / 2) / 2);
		} else {
			result = (num.get(size / 2));
		}
	
		System.out.println(result);
		
	}
	
	

}
