package lab24_07company1;

public class CustomerSameSC extends Customer1{
	protected void aa() {
		System.out.println("Customer same sc");
	}
	public static void main(String[] args) {
		CustomerSameSC obj = new CustomerSameSC();
		obj.aa();
		obj.Customerdetails();
	}

}
