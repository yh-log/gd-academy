package exception;

public class Throws_MainClass {

	public static void main(String[] args) {

		try{
			Throws_Calculator calc = new Throws_Calculator();
			
			calc.calculate(1, 0);
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
