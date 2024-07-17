package api_Javalang;

/*
https://pre.goodee.co.kr/member/myclassroom?memno=40&classno=2&orderno=1#totalviewarea
src 배열의 3번째 요소부터 3개의 요소를 dest 배열의 4번째 위치부터 복사하여 한 줄로 출력하시오.
*/

public class Ex01_SystemClass {

	public static void main(String[] args) {

		exam();
		
	}
	
	public static void exam() {
		int[] src = {1, 2, 3, 4, 5};
		int[] dest = new int[10];
		
		System.arraycopy(src, 2, dest, 3, 3);
		
	    for (int i : dest) {
            System.out.print(i);
	}

}
}
