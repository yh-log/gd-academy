package control;

/**
 * https://pre.goodee.co.kr/member/myclassroom?memno=40&classno=2&orderno=1#toppage
 * 방정식 2x+4y=10의 모든 해를 구하기
 */
public class Ex_for1 {

	public static void main(String[] args) {
		
		exam();
	}
	
	public static void exam() {
		
		for(int x = 0; x <= 10; x++) {
			for(int y = 0; y <= 10; y++) {
				if((2 * x) + (4 * y) == 10)
				System.out.print("x=" + x + ",y=" + y + "/");
			} 
		} 
	} 

}
