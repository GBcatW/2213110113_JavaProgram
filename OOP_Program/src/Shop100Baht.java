import javax.swing.*;

public class Shop100Baht {

	public static void main(String[] args) {
		Product1 sold = new Product1();
		int result = JOptionPane.showConfirmDialog(null, "is the program run on Pattanakarn Branch?", "Run Program",
				     JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
		if(result == 0) {
			sold = new PattanakarnBranch();
		}
		
		sold.setUnit(Integer.parseInt(JOptionPane.showInputDialog("Input the number of product:")));
		JOptionPane.showMessageDialog(null, sold);
		
	}

}
