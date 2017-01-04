
public class LibraryFloor {
	
	private static LibraryArea[] firstFloor; 
	private static LibraryArea[] secondFloor;
	private static LibraryArea[] thirdFloor; // Pretty sure the array lengths are wrong
	private static LibraryArea[] fourthFloor;
	private static LibraryArea[] fifthFloor;
	
	public LibraryFloor(LibraryArea[] floor, int num){
		switch (num) {
			
		case 1:
			firstFloor = floor;
			break;
		case 2:
			secondFloor = floor;
			break;
		case 3:
			thirdFloor = floor;
			break;
		case 4:
			fourthFloor = floor;
			break;
		case 5:
			fifthFloor = floor;
			break;
		default:
			System.out.println("Enter a valid floor number");
			
		}
	}
	
	
}
