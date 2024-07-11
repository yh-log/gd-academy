package inheritance;

public class Override_1Car {
	
	private String model;
	
	
	public Override_1Car(String model) {
		this.model = model;
	}
	
	public void forward() {
		System.out.println("앞으로");
	}
	
	public void reverse() {
		System.out.println("뒤로");
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
