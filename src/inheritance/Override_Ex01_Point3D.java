package inheritance;

public class Override_Ex01_Point3D extends Override_Ex01_Point{
	
	private int z;
	public Override_Ex01_Point3D(int x, int y, int z) {
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
		Override_Ex01_Point3D p = new Override_Ex01_Point3D(1, 2, 3);
	}
	
	
	

}
