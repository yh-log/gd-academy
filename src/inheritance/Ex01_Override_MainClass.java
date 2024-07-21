package inheritance;

public class Ex01_Override_MainClass {

	public static void main(String[] args) {

		exam();
		
	}
	
	public static void exam() {
		Ex01_Override_Point3D p = new Ex01_Override_Point3D(1, 2, 3);
		System.out.println(p.location());
	}

}
