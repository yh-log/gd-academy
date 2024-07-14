package collection_framework;

public class WrapperClass {

	public static void main(String[] args) {

//		Wrapper class : 기본자료형을 클래스로 만들어 둔 것
//		boolean		Boolean
//		byte		Byte
//		short		Short
//		int			Integer
//		long		Long
//		float		Float
//		double		Double
//		char		Character
		
//		필드는 값을 가지고, 메소드는 기능을 가진다.
//		boolean 이 아닌 Boolean 으로 저장하면 t/f 이외 기능을 사용할 수 있다.
		
//		값을 그냥 저장할 수 있다. (Auto Boxing = 자동박싱)
		Integer a = 10;
		
//		값을 그냥 꺼낼 수 있다. (Auto Unboxing)
		int b = a + 10;
		
		System.out.println(a);
		System.out.println(b);
		
//		"문자열" -> 값 으로 바꾸는 (파싱)
		
		int x= Integer.parseInt("123");  // .으로 호출하는 = static 처리 되어있는 클래스 메소드)
		System.out.println(x);
		
		long y = Long.parseLong("1234567890");
		System.out.println(y);
		
		double z = Double.parseDouble("12.32");
		System.out.println(z);
	

}
}
