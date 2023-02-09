import java.util.*;

import javax.swing.JOptionPane;

public class RectangleDemo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input width :");
		double width = scan.nextDouble();
		System.out.print("Input length :");
		double length = scan.nextDouble();
		
		Rectangle2 rec2 = new Rectangle2(width, length);
		System.out.println(rec2);
		System.out.println("Area of Rectangle is " + rec2.getArea());
	}

}
