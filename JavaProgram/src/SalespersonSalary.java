import java.util.*;
import java.text.*;

public class SalespersonSalary {
	static final double COMMISSION_RATE = 0.15;
	static final int SENTINEL = -1; // Terminating value for input

	public static void main(String[] args) {
		int sales; // Input gross sales
		double salary; // Salary to be computed
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("Enter sales in dollars (or -1 to end): ");
			sales = scan.nextInt();
			if (sales == SENTINEL)
				System.out.print("Bye");
			else {
				salary = (sales * COMMISSION_RATE) + 1000;
				System.out.println("Salary is: $" + frm.format(salary));
				System.out.println();
			}
		} while (sales != SENTINEL);
	}

}
