import java.util.*;
import java.io.*;

public class ATMBanking {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String id, pass;
		System.out.print("Enter account number : ");
		id = console.next();
		boolean checkNum = false;
		boolean checkDash = false;
		boolean checkLength = false;
		for (int i = 0;i<id.length();i++) {
			if((id.indexOf(i) >= '0' && id.indexOf(i)<= '9')|| id.indexOf(i) == '-')
				checkNum=true;
		}
		if(id.charAt(1)!= '-' && id.charAt(5)!= '-' && id.charAt(9)!= '-' 
					&& id.charAt(12)!= '-' && id.length()!= 14 )
			checkDash = true;
		if(id.length() == 15) checkLength = true;
		while(!checkNum ||!checkDash||!checkLength) {
			System.out.print("Enter account number : ");
			id = console.next();
			checkNum = false;
			checkDash = false;
			checkLength = false;
			for (int i = 0;i<id.length();i++) {
				if((id.indexOf(i) >= '0' && id.indexOf(i)<= '9')|| id.indexOf(i) == '-')
					checkNum=true;
			}
			if(id.charAt(1)!= '-' && id.charAt(5)!= '-' && id.charAt(9)!= '-' 
						&& id.charAt(12)!= '-' && id.length()!= 14 )
				checkDash = true;
			if(id.length() == 15) checkLength = true;
		}
		System.out.print("Enter password : ");
		pass = console.next();
		while(pass.length() != 4) {
			System.out.print("Enter password : ");
			pass = console.next();
		}
	}

}
