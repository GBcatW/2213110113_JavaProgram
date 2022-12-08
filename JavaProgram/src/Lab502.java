import javax.swing.*;

public class Lab502 {
	static String email;
	public static void main(String[] args) {
		inputEmail();
		
	}
	public static void inputEmail() {
		String answer ="";
		do {
			email = JOptionPane.showInputDialog("Input your e-mail");
			checkEmailError(email);
			answer = JOptionPane.showInputDialog("Continue[y||Y to continue]");
		}while(answer.equalsIgnoreCase("y"));
	}
	public static void checkEmailError(String chkEmail) {
		while (chkEmail.startsWith("@") || chkEmail.contains(" ")) {
			chkEmail = JOptionPane.showInputDialog("Input your e-mail, again:");
		}
		chkEmail = chkEmail.toLowerCase();
		JOptionPane.showMessageDialog(null, checkEmail(chkEmail)
				?"Your e-mail is " + chkEmail
				:"Your e-mail is not hotmail or gmail dot com ");
	}
	public static boolean checkEmail(String chkEmail) {
		if(chkEmail.endsWith("@gmail.com") || chkEmail.endsWith("@hotmail.com")){
			return true;
		}
		else return false;
	}

}
