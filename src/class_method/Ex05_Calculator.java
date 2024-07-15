package class_method;

/*
https://pre.goodee.co.kr/member/myclassroom?memno=40&classno=2&orderno=1#totalviewarea
begin 부터 end 사이 정수 중 짝수의 합을 반환하시오.
*/

public class Ex05_Calculator {

	int getEvenTotal(int begin, int end) {
		
		int sum = 0;
		
		for(int i = begin; i <= end; i++) {
			if(i % 2 == 0) {
				sum += i;
		}
			
		}
		return sum;
	}
	
}
