package chapter12;

public class Box<T> {  // 제네릭을 사용한 메서드  
	
	private T itemName;
	
	
	
	public T getItemName() {
		return itemName;
	}
   public void setItemName(T itemName) {
	   this.itemName = itemName;
   }
}
