import java.util.Scanner;

public class FictionDemo1 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Input Book's name : ");
		String bookName = scan.nextLine();
		System.out.print("Input Book's year : ");
		int bookYear = scan.nextInt();
		
		FictionBook book = new FictionBook(bookName, bookYear);
		
		System.out.print("Input Author name : ");
		scan.nextLine();
		String author = scan.nextLine();
		book.setAuthorName(author);
		while(book.checkFormatName()) {
			System.out.print("Input Author name, again : ");
			author = scan.nextLine();
			book.setAuthorName(author);
		}
		
		System.out.print("Input Author email : ");
		String email = scan.nextLine();
		book.setEmail(email);
		while(!book.checkEmail()) {
			System.out.print("Input Author email, again : ");
			email = scan.nextLine();
			book.setEmail(email);
		}
		System.out.print(book);
	}

}
