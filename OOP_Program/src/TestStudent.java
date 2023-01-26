
public class TestStudent {

	public static void main(String[] args) {
		Student stu1 = new Student("Jirapat Anantasiri","1 Happy Ave");
		System.out.println(stu1);
		
		//Test Setters and Getters
		stu1.setAddress("25 Pattanakarn");
		System.out.println(stu1);//ToString
		System.out.println(stu1.getName());
		System.out.println(stu1.getAddress());
		
		stu1.addCourseGrade("INT107", 25);
		stu1.addCourseGrade("INT108", 79);
		stu1.addCourseGrade("MSC202", 59);
		stu1.printGrades();
		
		System.out.printf("The average grade is %.2f%n", stu1.getAverageGrade());
	}

}
