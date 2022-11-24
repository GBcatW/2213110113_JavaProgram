import java.util.Random;
import javax.swing.*;
import java.text.*;

public class Lab303 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###");
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		int countThousand, countFiveHundred, countHundred, countThousandMod, countFiveHundredMod, countHundredMod;
		int money = Integer.parseInt(
				JOptionPane.showInputDialog("Your balance: " + frm.format(balance) + "\nInput money to withdraw:"));

		if (money >= balance) {
			JOptionPane.showMessageDialog(null, "ERROR: Cannot withdraw more than balance", "ERROR",
					JOptionPane.ERROR_MESSAGE);
		} else if (money > 20000) {
			JOptionPane.showMessageDialog(null, "ERROR: Cannot withdraw more than " + frm.format(20000), "ERROR",
					JOptionPane.ERROR_MESSAGE);
		} else if (money % 100 != 0) {
			JOptionPane.showMessageDialog(null, "ERROR: Cannot withdraw " + money % 100 + " baht.", "ERROR",
					JOptionPane.ERROR_MESSAGE);
		} else {
			countThousand = money / 1000;
			countThousandMod = money % 1000;
			countFiveHundred = countThousandMod / 500;
			countFiveHundredMod = countThousandMod % 500;
			countHundred = countFiveHundredMod / 100;
			countHundredMod = countFiveHundredMod % 100;
			JOptionPane.showMessageDialog(null, "You withdraw " + frm.format(money) + " baht." + "\n1,000 = "
					+ countThousand + "\n500 = " + countFiveHundred + "\n100 = " + countHundred);
		}
	}

}
