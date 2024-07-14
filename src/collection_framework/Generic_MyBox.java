package collection_framework;

public class Generic_MyBox <T>{
	
	// 제네릭 : 미리 정해두지 않고 나중에 정하는 것
	
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
	

}
