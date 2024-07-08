package array;

// 배열과 반복문 (for문과 향상된 for문 활용)

public class Array_02 {

	public static void main(String[] args) {
		// * 인덱스는 i로 명칭
		
		// 1. 일반 for 문
		String[] animals = {"기린", "호랑이", "코뿔소"};
		System.out.println(animals.length);
		for(int i = 0; i < animals.length; i++) {
			System.out.println(animals[i]);
		}
		 
		
		// 2. 향상된 for 문
		int[] numbers = {10, 20, 30};
		for(int n : numbers) {
			System.out.println(n);
		}
	}

}
