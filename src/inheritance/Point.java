package inheritance;

public class Point {
	private int x, y;
	  public Point(int x, int y) {
	    this.x = x;
	    this.y = y;
	  }
	  String location() {
	    return "x="+x+",y="+y;
	  }

}
