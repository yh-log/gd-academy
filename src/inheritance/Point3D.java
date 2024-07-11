package inheritance;

public class Point3D extends Point { 
	private int z;

	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public static void exam() {
	  Point3D p = new Point3D(1,2,3);
	  System.out.println(p.location());
	} 
	
	@Override
	public String location() {
		String result = super.location() + ",z=" + this.z;
		return result;
	}
	
	public static void main(String[] args) {
		exam();
	}
	

}
