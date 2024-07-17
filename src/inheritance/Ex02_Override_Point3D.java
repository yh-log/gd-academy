package inheritance;

public class Ex02_Override_Point3D extends Ex02_Override_Point{
	
	private int z;
	public Ex02_Override_Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
		System.out.println(location());
	}
	
	@Override
	String location() {
		String result = super.location() + ",z=" + this.z;
		
		return result;
	}
	
	public static void main(String[] args) {
		Ex02_Override_Point3D p = new Ex02_Override_Point3D(1, 2, 3);
	}
	
	
	

}
