package lab31_07;

public class Product {

	int price;
	String name;
	
	public Product(int price, String name){
		this.price=price;
		this.name =name;
	}
	
	public String toString() {
		return price+" - "+name;
	}
	
}
