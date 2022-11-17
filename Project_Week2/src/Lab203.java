import java.util.*;

public class Lab203 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input two integers(a b):");
		int numA = scan.nextInt();
		int numB = scan.nextInt();
		int sum = numA+numB;
		System.out.println("Sum of two integers:" + sum);
		int count = 0;
		while(sum != 0)
		{
			sum/=10;
			count++;
		}
		System.out.println("Digit number of sum of said two integers:");
		System.out.print(count);
	}

}
