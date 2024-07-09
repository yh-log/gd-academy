package constructor;

public class Field_02 {

	public static void main(String[] args) {

		// 다른 클래스에서는 객체를 생성하고 필드를 사용할 수 있다.
		// Field_01 타입의 field 객체 생성
		Field_01 field = new Field_01();
		
		// field 객체를 이용한 필드 접근
		field.id = "master";
		System.out.println(field.id);
		
		field.mathod();
	}

}
