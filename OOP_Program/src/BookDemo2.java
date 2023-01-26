import javax.swing.*;

public class BookDemo2 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Input author name");
		String email = JOptionPane.showInputDialog("Input author e-mail");
		
		String title = JOptionPane.showInputDialog("Input book title");
		int page = Integer.parseInt(JOptionPane.showInputDialog("Input book page"));
		int result = JOptionPane.showConfirmDialog(null, "is the page correct?", "Confirm",
				   JOptionPane.YES_NO_OPTION,
	               JOptionPane.QUESTION_MESSAGE);
		
		Book1 book = new Book1(title, new Author1(name, email), page);
		while (result == JOptionPane.NO_OPTION) {
			book.setPage(Integer.parseInt(JOptionPane.showInputDialog("Input book page, again")));
			result = JOptionPane.showConfirmDialog(null, "is the page correct?", "Confirm",
					JOptionPane.YES_NO_OPTION,
		            JOptionPane.QUESTION_MESSAGE);
		}
		JOptionPane.showMessageDialog(null, "Book Title: " + book.getTitle()
							+ "\nAuthor name: " + book.getAuthor().getName() + "(" + book.getPage() +")"
							+ "\nAuthor e-mail: " + book.getAuthor().getEmail());
	}

}
