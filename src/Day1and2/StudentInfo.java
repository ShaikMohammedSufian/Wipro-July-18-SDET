package Day1and2;

public class StudentInfo {
//student info
	//instance variables
	
	String StuName = "Sufian";
	
	int Rollno = 547;
	
	String Dept = "CSE";
	
	public void Getinfo() {
		System.out.println(StuName);
		System.out.println(Rollno);
		System.out.println(Dept);
		//Local Variable
		
		String Location = "AP";
		
		System.out.println(Location);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentInfo s = new StudentInfo();
		s.Getinfo();
	}

}
