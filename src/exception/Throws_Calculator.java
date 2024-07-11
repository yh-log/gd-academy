package exception;

public class Throws_Calculator {
	
//	throws : 메소드에서 발생한 예외를 던지는 것
	
	
	public void calculate(int a, int b) throws ArithmeticException{
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
	}

}
