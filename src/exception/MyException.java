package exception;

// 사용자 정의 예외 클래스
public class MyException extends Exception{
	
	private int errorCode;
	
	public MyException(String message) {
		super(message); // Exception에 message를 전달
	}
	
	public MyException(String message, int errorCode) {
		super(message);
		this.errorCode = errorCode;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

}
