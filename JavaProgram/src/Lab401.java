import java.util.*;

public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name : ");
		String fullName = scan.nextLine();
		String firstName, lastName;
		int space = fullName.indexOf(' ');
		if(space == -1) {
			System.out.print("Incorrect Name");
		}
		else {
			firstName = fullName.substring(0,space).toUpperCase();
			lastName = fullName.substring(space+1).toLowerCase();
			System.out.println("First Name : " + firstName);
			System.out.println("Last Name : " + lastName);
		}
	}
}
