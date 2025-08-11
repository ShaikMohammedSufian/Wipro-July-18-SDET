package lab24_07company2;
import lab24_07company1.Customer1;
public class Customerdiffsc extends Customer1 {
	protected void mm() {
		System.out.println("customer diffsc");
	}
	public static void main(String[] args) {
		Customerdiffsc obj = new Customerdiffsc();
		obj.mm();
		obj.Customerdetails();
	}

}
