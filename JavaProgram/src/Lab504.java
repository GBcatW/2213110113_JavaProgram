import java.util.*;

public class Lab504 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name, separated by a space.\n:");
		String fullName = scan.nextLine();
		String firstName;
		int space = fullName.indexOf(' ');
		firstName = fullName.substring(0, space);
		String abbName = abbreviatName(fullName);
		System.out.println(abbName.toUpperCase() + firstName);
	}

	public static String abbreviatName(String fullname) {
		String firstLetter = "";
		for (int i = 0; i < fullname.length(); i++) {
			if (fullname.charAt(i) == ' ') {
				firstLetter += fullname.charAt(i + 1);
				firstLetter += ".";
			}
		}
		return firstLetter;
	}
}
