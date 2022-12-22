import java.util.*;

public class TestPiggyBank {
	static Scanner scan = new Scanner(System.in);
	static PiggyBank pb = new PiggyBank();
	public static void main(String[] args) {
		sizeOfPiggyBank();
	}// end of main
	public static void sizeOfPiggyBank() {
		System.out.println("Money Total : " + pb.getTotal());
		System.out.print("Please difine size of PiggyBank: ");
		//int size = scan.nextInt();
		pb.setPiggyBank(scan.nextInt());
		System.out.println("Size of PiggyBank: " + pb.getPiggyBank());
		
		inputCoin();
	}
	public static void inputCoin() {
		//int selectMenu;
		//do {
		while(true){
			System.out.println();
			System.out.println("====================");
			System.out.println("Menu of PiggyBank");
			System.out.println("====================");
			System.out.println("[1] one baht.");
			System.out.println("[2] two baht.");
			System.out.println("[3] five baht.");
			System.out.println("[4] ten baht.");
			System.out.println("[5] Exit");
			System.out.println("====================");
			System.out.print("Please Select Menu[1-5]:");
			int selectMenu = scan.nextInt();
			if(selectMenu == 1) {
				System.out.print("Insert 1 Baht Money:");
				pb.addOne(scan.nextInt());
				System.out.println("Money Total : " + pb.getTotal());
			}
			else if(selectMenu == 2) {
				System.out.print("Insert 2 Baht Money:");
				pb.addTwo(scan.nextInt());
				System.out.println("Money Total : " + pb.getTotal());
			}
			else if(selectMenu == 3) {
				System.out.print("Insert 5 Baht Money:");
				pb.addFive(scan.nextInt());
				System.out.println("Money Total : " + pb.getTotal());
			}
			else if(selectMenu == 4) {
				System.out.print("Insert 10 Baht Money:");
				pb.addTen(scan.nextInt());
				System.out.println("Money Total : " + pb.getTotal());
			}
			else if (selectMenu == 5){
				System.out.println("Bye Bye");
				break;
			}
		}
		//}while(selectMenu!=5);
	}
	
}
