import java.util.*;

public class Lab404 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Text : ");
		String text = scan.nextLine().toLowerCase();
		text = text.replace(" ","");
		int x = text.length();
		boolean isPalindrome = true;
		for(int i = 0; i<x;i++) {
			if(text.charAt(i) == text.charAt(text.length()-1-i));
			else
			{
				isPalindrome = false;
				break;
			}
		}
		String result = isPalindrome? "It is palindrome":"It is not palindrome";
		System.out.print(result);
	}

}
