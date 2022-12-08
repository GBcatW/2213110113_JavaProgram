import javax.swing.*;

public class Lab503 {
	static int inputYear;
	public static void main(String[] args) {
		inputYear = Integer.parseInt(JOptionPane.showInputDialog("Input Year"));
		//boolean chkYear = checkYear(inputYear);	
		//System.out.print(chkYear);
		while(!checkYear(inputYear)) {
			inputYear = Integer.parseInt(JOptionPane.showInputDialog("Input Year between 1000-3000"));
		}
		/*if(isleapYear(inputYear)) {
			JOptionPane.showMessageDialog(null, inputYear + " is Leap Year");
		}
		else {
			JOptionPane.showMessageDialog(null, inputYear + " is NOT Leap Year");
		}*/
		JOptionPane.showMessageDialog(null, inputYear +(isleapYear(inputYear)
				? " is "
				: " is NOT ") + "leap year.");
	}//end of main() method
	public static boolean checkYear(int year) {
		if((year>= 1000 && year<=3000)) {
			return true;
		}
		else return false;
	}
	public static boolean isleapYear(int year) {
		if((year%4==0) && ((year%100!=0)||(year%400==0))) {
			return true;
		}
		else return false;
	}
}
