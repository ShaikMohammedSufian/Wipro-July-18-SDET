package lab25_07;

public class CircleClass implements ShapeInterface {
	public void getArea() {
		System.out.println("area of Circle is 14");
	}
	public static void main(String[] args) {
		CircleClass c = new CircleClass();
		c.getArea();
	}

}
