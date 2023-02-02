import java.util.*;

public class MovieDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input movie id	:");
		String id = scan.nextLine();
		System.out.print("Input movie name  :");
		String movieName = scan.nextLine();
		System.out.println();
		
		System.out.print("Input director name	:");
		String name = scan.nextLine();
		System.out.print("Input director email	:");
		String email = scan.nextLine();
		System.out.print("Input director gender	:");
		char gender = scan.next().toLowerCase().charAt(0);
		while(gender != 'm' && gender != 'f') {
			System.out.print("Input director gender, again :");
			gender = scan.next().toLowerCase().charAt(0);
		}
		System.out.println();
		
		System.out.print("Input movie theater no.	:");
		int theaterNo = scan.nextInt();
		while(theaterNo < 1 || theaterNo > 15) {
			System.out.print("Please input 1 - 15 only :");
			theaterNo = scan.nextInt();
		}
		
		System.out.println();
		Theater theater = new Theater(id, movieName, new Director(name, email, gender), theaterNo);
		System.out.println(theater);
	}

}
