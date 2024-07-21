package inheritance;

public class Ex01_Override_Point {
	
	private int x, y;
	public Ex01_Override_Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	String location() {
		return "x=" + x + "y=" + y;
	}

}
