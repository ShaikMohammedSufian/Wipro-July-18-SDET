package lab24_07company1;

public class SameEmployeeSc extends Employee1 {
	public void ff() {
		System.out.println("same pack sc");
	}
	public static void main(String[] args) {
		SameEmployeeSc obj = new SameEmployeeSc();
		obj.ff();
		obj.Details();
	}

}
