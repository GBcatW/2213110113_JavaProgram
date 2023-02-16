import java.util.*;
import java.io.*;

public class ATMChecking extends ATMData{
	private int money;
	
	public ATMChecking(String accountNumber, String password, int money) {
		super(accountNumber, password);
		this.money = money;
	}
	
	public boolean checkBookBank()throws IOException {
		Scanner read = new Scanner(new File("ATMBookBank.txt"));
		String id, pass;
		boolean check = false;
		while(read.hasNext()) {
			id = read.next();
			pass = read.next();
			int balance = read.nextInt();
			if(id == getID()&&pass == getPass()&&balance >= money) {
				check = true;
				break;
			}
		}
		read.close();
		return check;
	}
	
	public void show()throws IOException {
		
	}
}
