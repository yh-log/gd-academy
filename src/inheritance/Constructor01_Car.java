package inheritance;

public class Constructor01_Car {
	
	private String model;
	
	
	public Constructor01_Car(String model) {
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
