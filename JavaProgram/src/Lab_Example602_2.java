import javax.swing.*;

public class Lab_Example602_2 {
	static String[] deptName = {"Accounting","HR","Sales","Innovation"};
	static boolean deptWasFound = false;
	public static void main(String[] args) {
		inputName();
	}//end main
	public static void inputName() {
		String dept = JOptionPane.showInputDialog("Enter a department name");
		//boolean chkName = checkName(dept);
		/*if (checkName(dept)) {
			JOptionPane.showMessageDialog(null, dept + " was found in the list");
		} else {
			JOptionPane.showMessageDialog(null, dept + " was not found in the list");
		}*/
		boolean chkName = (checkName(dept));
		JOptionPane.showMessageDialog(null, (chkName)?dept + " was found in the list":dept + " was not found in the list");
	}//end input
	public static boolean checkName(String name) {
		for(int i = 0; i <deptName.length;i++) {
			if(name.equalsIgnoreCase(deptName[i])) {
				deptWasFound = true;
			}
		}//end for
		return deptWasFound;
	}//end check
}
