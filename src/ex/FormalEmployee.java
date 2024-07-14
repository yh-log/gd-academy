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

public class FormalEmployee extends Employee{
	
	private int empNo; // 직원번호
	private int salary; // 연봉
	
	// 생성자
	public FormalEmployee(String name, String dept, int empNo, int salary) {
		super("정규직", name, dept);
		this.empNo = empNo;
		this.salary = salary;
	}
	
	@Override
	public String getInfo() {
		return super.getInfo() + "," + empNo + "," + salary;
	}
	
	@Override
	public int getPay() {
		return salary / 12;
	}
	
	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
}
