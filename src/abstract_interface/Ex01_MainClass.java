package abstract_interface;

public class Ex01_MainClass {
	
	public static void main(String[] args) {

		exam();
		
	}
	
	public static void exam() {
		
		Ex01_Game game = new Ex01_BoardGame();
		game.play();
		
	}

}
