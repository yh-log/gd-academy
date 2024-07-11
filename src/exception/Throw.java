package exception;

public class Throw {

	public static void main(String[] args) {

//		점수에 따른 학점 계산
		
		try {
			int score = -100;  // 0-100
			
			if(score < 0 || score > 100) {
//				throw문 : 예외를 직접 만들고, 직접 던질 때 사용
				throw new RuntimeException(score + "점은 불가능한 점수입니다.");
				
			}
			
			String grade = null;
			
			if(score >= 90) {
				grade = "A";
			} else if(score >= 80) {
				grade = "B";
			} else {
				grade = "C";
			}
			
			System.out.println("점수는" + score + "점이고 학점은" + grade + "입니다.");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
