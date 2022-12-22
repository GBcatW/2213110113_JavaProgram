import java.util.*;

public class CheckStockProduct {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("How many product list in stock: ");
		int size = scan.nextInt();
		Product[] productList = new Product[size];
		System.out.println();
		for(int i = 0;i<productList.length;i++) {
			productList[i] = new Product();
			System.out.print("Input product Id   :");
			productList[i].setId(scan.next());
			System.out.print("Input product Unit :");
			productList[i].setUnit(scan.nextInt());
			System.out.println();
		}
		
	}
	public static void header (String message) {
		System.out.println("----------------------------------------");
		System.out.println("List of product in " + "'" + message + "' status.");
		System.out.println("----------------------------------------");
	}

}
