package class_method;

public class OverLoad_Calculator_Main {
		
		void add(int... numbers) {
			int total = 0;
			for(int i = 0; i < numbers.length; i++) {
				total += numbers[i];
			
		}
			System.out.println(total);
		}	
			
		void add(double... numbers) {
			double total = 0.0;
			for(int i = 0; i < numbers.length; i++) {
				total += numbers[i];
	
		}	
			System.out.println(total);
	}

}

