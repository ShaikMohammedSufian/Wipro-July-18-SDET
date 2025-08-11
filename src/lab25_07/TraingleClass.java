package lab25_07;

public class TraingleClass implements ShapeInterface{
	public void getArea() {
		System.out.println("area of Traingle is 20");
	}
	public static void main(String[] args) {
		TraingleClass t = new TraingleClass();
		t.getArea();
	}

}
