package inheritance;

public class Override_Ex01_MainClass {

	public static void main(String[] args) {

		exam();
		
	}
	
	public static void exam() {
		Override_Ex01_Point3D p = new Override_Ex01_Point3D(1, 2, 3);
		System.out.println(p.location());
	}

}
