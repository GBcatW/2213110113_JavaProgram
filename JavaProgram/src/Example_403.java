import java.util.*;
import javax.swing.*;

public class Example_403 {

	public static void main(String[] args) {
		/*Scanner scan = new Scanner(System.in);
		System.out.print("Input a sentence : ");
		String sentence = scan.nextLine();
		while (!sentence.endsWith(".")) {
			System.out.print("Input a sentence, again : ");
			sentence = scan.nextLine();
		}
		System.out.println();
		int spaceofWord = 0;
		for(int i = 0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				spaceofWord++;
			}
		}
		System.out.println("This sentence has " + spaceofWord + " spacebar.");
		System.out.println("This sentence has " + (spaceofWord+1) + " word.");*/
		String sentence = JOptionPane.showInputDialog("Input a sentence : ");
		while (!sentence.endsWith(".")) {
			sentence = JOptionPane.showInputDialog("Input a sentence, again : ");
			
		}
		int spaceofWord = 0;
		for(int i = 0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				spaceofWord++;
			}
		}
		JOptionPane.showMessageDialog(null, "This sentence has " + spaceofWord + " spacebar."
				+ "\nThis sentence has " + (spaceofWord+1) + " word.");
	}
}
