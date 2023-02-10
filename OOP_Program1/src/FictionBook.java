import java.time.*;
public class FictionBook implements Author, Book {
	private String author_name;
	private String email;
	private String titie;
	private int publicYear;
	
	public FictionBook(String title, int publicYear) {
		author_name = "";
		email = "";
		this.titie = title;
		this.publicYear = publicYear;
	}
	
	public void setAuthorName(String name) {
		author_name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean checkFormatName() {
		return ((!author_name.contains(" ")) ? true : false);
	}
	
	@Override
	public String getLastName() {
		return author_name.split(" ")[1].toUpperCase();
	}
	
	@Override
	public String getFirstName() {
		return author_name.split(" ")[0].toUpperCase();
	}
	
	@Override
	public boolean checkEmail() {
		return (email.endsWith("@hotmail.com") || email.endsWith("@windowslive.com")) && !(email.contains(" "))? true : false;
	}
	
	@Override
	public String getTitle() {
		return this.titie;
	}
	
	@Override
	public int totalPublicYear() {
		return LocalDateTime.now().getYear() - publicYear;
	}
	
	public String toString() {
		return getTitle() + " write by " + getLastName().charAt(0) 
				+ "." + getFirstName() + " (" + this.email + ") \nPublished for "
				+ totalPublicYear()+ " years.";
	}
}
