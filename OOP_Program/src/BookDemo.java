import java.util.*;
public class BookDemo {

	public static void main(String[] args) {
		Book book = new Book();
		Scanner scan = new Scanner(System.in);
		System.out.print("Input book title   : ");
		book.setTitle(scan.nextLine());
		System.out.print("Input book price   : ");
		book.setPrice(scan.nextFloat());
		System.out.print("Input publish year : ");
		book.setPublishyear(scan.nextInt());
		System.out.println();
		System.out.println(book);
	}

}
