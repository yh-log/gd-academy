package exception;

public class Try_Catch {

	public static void main(String[] args) {

		try {
		
			int a = 5;
			int b = 0;
			
			System.out.println(a + b);
			System.out.println(a - b);
			System.out.println(a * b);
			
			System.out.println(a / b); // 정수 / 0 은 에러가 발생함
			
			System.out.println(a % b);
		} catch(Exception e) {
//			예외 메세지
			System.out.println(e.getMessage());
//			예외 발생 문구를 의도적으로 확인할 수 있음 (상세 정보)
			e.printStackTrace();
		}
	}

}
