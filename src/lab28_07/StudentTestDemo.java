package lab28_07;
import java.util.Scanner;
public class StudentTestDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Id: ");
		int studentId = sc.nextInt();
		StudentData obj = new StudentData();
		try
		{
			obj.checkStudentId(studentId);
			
		}
		catch(InvalidStudentException ins) {
			System.out.println(ins.getMessage());
		}
		sc.close();
	}
}
