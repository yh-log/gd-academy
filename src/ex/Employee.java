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

public class Employee {
	
	private String type; // 직원구분
	private String name; // 이름
	private String dept; // 소속부서
	
	// 생성자 - Employee 클래스를 사용하기 위한 객체 생성
// 필요 없었던 내용임
		public Employee(String type, String name, String dept) {
		this.type = type;
		this.name = name;
		this.dept = dept;
	}
	
//	여기 질문있어요~!!!!!
//	Q. 수퍼클래스에서 값을 넣지 않으면 setter은 없이 getter만 있으면 되나요?
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
//	=================================
	
//	직원구분, 이름, 부서를 알 수 있는 메소드
	public String getInfo() {
		return type + "," + name + "," + dept; 
		
	}
	
//	직원의 연봉은 메인메소드에서 정의하므로 여기에서는 정하지 않음
	 public int getPay() { 
		return 0;
	 }
	  
}