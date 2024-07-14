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

public class InformalEmployee extends Employee{
	
	private int primartPay; // 기본임금(1000)

//	생성자
	public InformalEmployee(String name, String dept, int primartPay) {
		super("비정규직", name, dept);
		this.primartPay = primartPay;
	}
	
	@Override
	public int getPay() {
		return primartPay;
	}
	
	@Override
	public String getInfo() {
		return super.getInfo() + "," + primartPay;
	}

	public int getPrimartPay() {
		return primartPay;
	}

	public void setPrimartPay(int primartPay) {
		this.primartPay = primartPay;
	}
	

}
