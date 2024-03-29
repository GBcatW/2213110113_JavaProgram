
public class VideoStoreLauncher {

	public static void main(String[] args) {
		// Test a Video.
		Video vid1 = new Video();
		vid1.setTitle("The Godfather");
	
		vid1.addRating(3);
		vid1.addRating(2);
		vid1.addRating(5);
		//vid1.getRating();
		
		System.out.println(vid1.getTitle()+":"+vid1.getRating());
		
		vid1.checkOut();
		getStatus(vid1);
		vid1.returnToStore();
		getStatus(vid1);
	}//end of main
	
	public static void getStatus(Video v) {
		if(v.isCheckedOut()) {
			System.out.print("\'"+ v.getTitle()+"\' is checked out.");
		}
		else {
			System.out.print("\'"+ v.getTitle()+"\' is on the shelves.");
		}
	}//end of getStatus
}
