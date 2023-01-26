import java.util.Scanner;
public class BookDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name, email, title;
		int page;
		System.out.print("Input author name  : ");
		name = scan.nextLine();
		System.out.print("Input author email : ");
		email = scan.next();
		
		Author1 author = new Author1(name,email);
		System.out.println(author);
		System.out.println();
		
		System.out.print("Input book title : ");
		scan.nextLine();
		title = scan.nextLine();
		System.out.print("Input book page : ");
		page = scan.nextInt();
		
		Book1 book = new Book1(title, author, page);
		System.out.println(book);
	}

}
