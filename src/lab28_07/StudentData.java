package lab28_07;

public class StudentData {
	int[]ids = {501,502,503,504,505};
	public void checkStudentId(int studentId) {
		if(studentId<=0) {
			throw(new InvalidStudentException("StudentId must be positive number"));
			
		}
		for(int id : ids) {
			if (id == studentId) {
				throw(new InvalidStudentException(studentId+" already exists"));
			}
		}
		System.out.println("Student Id : "+studentId); 
	}
}
