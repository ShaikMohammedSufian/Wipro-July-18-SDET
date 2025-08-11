package lab24_07company2;
import lab24_07company1.Employee1;
public class EmployeeDiffPackSC extends Employee1 {
	public void uu() {
		System.out.println("diff pack sc");
	}
	public static void main(String[] args) {
		EmployeeDiffPackSC obj2 = new EmployeeDiffPackSC();
		obj2.uu();
		obj2.Details();
		
	}

}
