package inheritance;

public class Override_Ex01_Point {
	
	private int x, y;
	public Override_Ex01_Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	String location() {
		return "x=" + x + "y=" + y;
	}

}
