package constructor;

/*
https://pre.goodee.co.kr/member/myclassroom?memno=40&classno=2&orderno=1#totalviewarea
클래스를 생성해 클래스의 생성자를 오버로딩 하시오.*/

public class Ex_Sub {

	public static void main(String[] args) {

		exam();
		
	}
	
	public static void exam() {
		Ex_Main com1 = new Ex_Main();
		Ex_Main com2 = new Ex_Main("gram");
	}

}
