import java.util.*;
import java.text.*;

public class StockProduct {
	static DecimalFormat df = new DecimalFormat("#,###.00");
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Product[] productList = new Product[4];
		double sum = 0;
		for(int i =0;i<productList.length;i++) {
			productList[i] = new Product();
			System.out.print("Input product Id   :");
			productList[i].setId(scan.next());
			System.out.print("Input product Unit :");
			productList[i].setUnit(scan.nextInt());
			while(!(productList[i].getUnit() > 0)) {
				System.out.print("Input product Unit, again :");
				productList[i].setUnit(scan.nextInt());
			}
			System.out.print("Input product Price :");
			productList[i].setPrice(scan.nextDouble());
			while(!(productList[i].getPrice() > 0)) {
				System.out.print("Input product Price, again :");
				productList[i].setPrice(scan.nextDouble());
			}
			System.out.println();
			sum += productList[i].calculate();
		}//end for
		
		System.out.println("--------------------------------------------");
		for (Product _product:productList) {
		System.out.println("Product ID : " + _product.getId()+ ", " + "Total price = " + df.format(_product.calculate())+ " baht.");
		}
		System.out.println("--------------------------------------------");
		System.out.print("Total price of all products is " + df.format(sum)+ " baht.");
	}

}
