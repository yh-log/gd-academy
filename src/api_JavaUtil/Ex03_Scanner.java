package api_JavaUtil;

import java.util.Scanner;

/*
https://pre.goodee.co.kr/member/myclassroom?memno=40&classno=2&orderno=1#totalviewarea
문자열에 포함된 숫자의 합과 평균을 출력하시오.

"10 20.5 30 56 86 80" 의 합계와 평균을 출력하시오.
단 평균은 소숫점 이하 2자리까지만 반올림하여 출력합니다.

[결과]
282.5
47.08
*/

public class Ex03_Scanner {

	public static void main(String[] args) {

		exam();
		
	}
	
	public static void exam() {
		Scanner scan = new Scanner("10 20.5 30 56 86 80");
		
		double sum = 0.0;
		int count = 0;
		
		while(scan.hasNext()) {
			if(scan.hasNextDouble()) {
				double num = scan.nextDouble();
				sum += num;
				count++; // 정의하지 않았는데 어떻게 사용이 가능하지?
				
			} else {
				scan.next();
			}
			
			scan.close();
				
		}
		
		double 
		
		
		
	}

}
