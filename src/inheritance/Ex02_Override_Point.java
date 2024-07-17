package inheritance;

public class Ex02_Override_Point {
	
	private int x, y;
	public Ex02_Override_Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	String location() {
		return "x=" + x + "y=" + y;
	}

}
