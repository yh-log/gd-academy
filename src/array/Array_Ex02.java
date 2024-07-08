package array;
/*
https://pre.goodee.co.kr/member/myclassroom?memno=40&classno=2&orderno=1#totalviewarea
배열 score에저장된 모든 요소의 합계, 평균, 최대값, 최소값, 최대값과 최소값의 위치를 출력
*/

public class Array_Ex02 {

	public static void main(String[] args) {
		
		exam();

	}
	
	public static void exam() {
		int[] score = {95, 85, 60, 70, 75, 65, 70, 90, 100, 55};
		
		// 배열의 합계
		int sum = 0;
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		} 
		System.out.println("합계:" + sum);

		// 배열의 평균
		double avg = 0;
		avg = (double) sum / (score.length);
		System.out.println("평균:" + avg);
		
		// 배열의 최대값과 최대값 인덱스, 최소값과 최소값 인덱스
		int max = score[0]; // 배열의 길이가 1일 경우를 대비
		int maxIndex = 0;
		int min = score[0]; // 배열의 길이가 1일 경우를 대비
		int minIndex = 0;
		
		for(int i = 0; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
				maxIndex = i;
			}
			if(score[i] < min) {
				min = score[i];
				minIndex = i;
			}
		} 
		System.out.println("최대:" + max);
		System.out.println("최대인덱스:" + maxIndex);
		System.out.println("최소:" + min);
		System.out.println("최소인덱스:" + minIndex);
		
		
	}

}
