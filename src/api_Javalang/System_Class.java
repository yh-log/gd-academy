package api_Javalang;

import java.util.Arrays;

public class System_Class {

	public static void main(String[] args) {

		// System 클래스
		
//		타임스탬프 1970+01+01 0:0:0 시간부터 현재까지 1/1000초 단위로 증가하고 있는 값
		long timsstamp = System.currentTimeMillis();  // 객체는 생성하지 않아도 가능하다.
		System.out.println(timsstamp);
		
//		나노타임 : 나노초(1/10억) 단위 시간을 알려주는 값, 2개 값을 사용해야 의미가 있음

//		시작시간
		long start = System.nanoTime();
		
//		시간을 측정하고 싶은 작업
		System.out.println("Hello World");
		
//		종료 시간
		long stop = System.nanoTime();

//		경과시간
		System.out.println(stop - start);
		
//		배열 복사
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = new int[10];
		
		System.arraycopy(arr1, 0, arr2, 2, arr1.length);  // arr1[0] 부터 5개 arr2[0]으로 보내기

		System.out.println(Arrays.toString(arr2)); // 반복문 없이 배열을 확인할 수 있는 방법
	}

}
