package lab24_07;

class Payment{
	public void pay() {
		System.out.println("Payment");
	}
}
class Creditcard extends Payment{
	public void pay() {
		System.out.println("Payment Using Creditcard");
	}
}
class UPI extends Payment{
	public void pay() {
		System.out.println("Payment using upi");
	}
}
class Netbanking extends Payment{
	public void pay() {
		System.out.println("payment using netbanking");
	}
}
public class Paymentsystem {

	public static void main(String[] args) {
		Payment obj = new Payment();
		obj = new Creditcard();
		obj.pay();
		obj= new UPI();
		obj.pay();
		
	}

}
