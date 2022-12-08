import java.util.*;

public class Lab505 {
    static String studentId, subjectId;
	public static void main(String[] args) {
		inputStudent();
	}

	public static void inputStudent() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Student Id : ");
		studentId = scan.nextLine();
		System.out.print("Enter Subject Id : ");
		subjectId = scan.nextLine();

		while (!isLength(studentId, subjectId)) {
			System.out.print("Enter Student Id : ");
			studentId = scan.nextLine();
			System.out.print("Enter Subject Id : ");
			subjectId = scan.nextLine();	
		}
		boolean ITStudent = isITStudent(studentId);
		boolean ITSubject = isITSubject(subjectId);
		displayData(ITStudent,ITSubject);
	}

	public static boolean isLength(String student, String subject) {
		if (student.length() == 10 && subject.length() == 7) {
			return true;
		}
		else return false;
	}
	public static boolean isITStudent(String student) {
		if(student.substring(2,3).equals("1") && student.substring(3, 6).equals("311")) {
			return true;
		}
		else return false;
	}
	public static boolean isITSubject(String subject) {
		if(subject.substring(0, 2).equals("21") && subject.substring(4, 5).equals("1")) {
			return true;
		}
		else return false;
	}
	public static void displayData(boolean Student,boolean Subject) {
		System.out.println("Student id: "+ studentId +((Student)?" ":" is not ")+
						"1st year student in IT\n" +((Subject)?"Enroll":"not enroll")+
						" in courses for Year 1");
	}
}
