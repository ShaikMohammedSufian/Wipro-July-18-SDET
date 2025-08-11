package lab25_07;

public class RectangleClass implements ShapeInterface {
	public void getArea() {
		System.out.println("area of rectangle is 6");
	}
	public static void main(String[] args) {
		RectangleClass r = new RectangleClass();
		r.getArea();
	}

}
