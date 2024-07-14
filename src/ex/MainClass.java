package ex;

/*
https://pre.goodee.co.kr/member/myclassroom?memno=40&classno=2&orderno=1#totalviewarea
[결과]
정규직,홍길동,총무부,1,5000
홍길동의 급여:416
비정규직,이비정,영업부,1000
이비정의 급여:1000
위 결과가 나오도록 Employee, FormalEmployee, InformalEmployee 클래스를 상속 관계로 구현하시오.
*/

public class MainClass {

	public static void main(String[] args) {

		exam();
		
	}
	
	public static void exam() {
		  FormalEmployee fe = new FormalEmployee("홍길동", "총무부", 1, 5000);
		  
		  System.out.println(fe.getInfo());
		  System.out.println(fe.getName() + "의 급여:" +   fe.getPay());

		  InformalEmployee ie = new InformalEmployee("이비정", "영업부", 1000);

		  System.out.println(ie.getInfo());
		  System.out.println(ie.getName() + "의 급여:" +  ie.getPay());
	}

}
