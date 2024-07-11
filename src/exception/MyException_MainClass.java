package exception;

public class MyException_MainClass {
	
	public static void main(String[] args) {
		
		try {
			
			throw new MyException("예외메시지", 1);
		} catch(MyException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getErrorCode());
		}
	}

}
