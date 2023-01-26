
public class Student {
	//The private instance variables
	private String name;
	private String address;
	//The courses and grades for the courses are kept in 2 parallel arrays
	private String[] courses;
	private int[] grades;//valid range is [0,100]
	private int numCourses;//Number of courses taken so far
	private static final int MAX_COURSE = 30; //Maximum number of courses taken by student
	
	/**Constructor a Student instance with the given input*/
	public Student (String name,String address) {
		this.name = name;
		this.address = address;
		courses = new String[MAX_COURSE];
		grades = new int[MAX_COURSE];
		numCourses = 0;
	}
	//public getters and setters.
	//No setter for name as it isn't designed to be changed.
	
	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return this.address;
	} 
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString() {
		return getName()+"("+ getAddress() +")";
	}
	
	public void addCourseGrade(String course, int grade) {
		courses[numCourses] = course;
		grades[numCourses] = grade;
		++numCourses;
	}
	
	/**Prints all course and their grades*/
	public void printGrades() {
		System.out.print(name);
		for(int i = 0;i<numCourses;i++) {
			System.out.print(" " + courses[i] + ":" + grades[i]);
		}
		System.out.println();
	}
	
	/**Computes the average grade*/
	public double getAverageGrade() {
		int sum = 0;
		for(int _grade:grades) {
			sum+=_grade;
		}
		return (double)sum/numCourses;
	}
}
