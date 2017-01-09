import java.util.ArrayList;
import java.util.List;

public class LibraryFloor {
	
	/*private static LibraryArea[] firstFloor; 
	private static LibraryArea[] secondFloor;
	private static LibraryArea[] thirdFloor; // Pretty sure the array lengths are wrong
	private static LibraryArea[] fourthFloor;
	private static LibraryArea[] fifthFloor;
	*/
	
	/*public LibraryFloor(LibraryArea[] floor){
		for (int i = 0; i < floor.length; i++){
			
			int length;
			
			switch (floor[i].getFloor()) {
			
			case 1:
				length = firstFloor.length;
				firstFloor[length] = floor[i];
				break;
			case 2:
				length = secondFloor.length;
				secondFloor[length] = floor[i];
				break;
			case 3:
				length = thirdFloor.length;
				thirdFloor[length] = floor[i];
				break;
			case 4:
				length = fourthFloor.length;
				fourthFloor[length] = floor[i];
				break;
			case 5:
				length = fifthFloor.length;
				fifthFloor[length] = floor[i];
				break;
			default:
				System.out.println("Not a valid floor number");
			
			}
			
		}
	}
	
	public LibraryFloor(LibraryArea area){
		
		int length;
		
		switch (area.getFloor()) {
		
		case 1:
			length = firstFloor.length;
			firstFloor[length] = area;
			break;
		case 2:
			length = secondFloor.length;
			secondFloor[length] = area;
			break;
		case 3:
			length = thirdFloor.length;
			thirdFloor[length] = area;
			break;
		case 4:
			length = fourthFloor.length;
			fourthFloor[length] = area;
			break;
		case 5:
			length = fifthFloor.length;
			fifthFloor[length] = area;
			break;
		default:
			System.out.println("Not a valid floor number");
		
		}
	}
	*/
	
	private static List<LibraryArea> firstFloor= new ArrayList<LibraryArea>();
	private static List<LibraryArea> secondFloor= new ArrayList<LibraryArea>();
	private static List<LibraryArea> thirdFloor= new ArrayList<LibraryArea>();
	private static List<LibraryArea> fourthFloor= new ArrayList<LibraryArea>();
	private static List<LibraryArea> fifthFloor= new ArrayList<LibraryArea>();
	
	public LibraryFloor(LibraryArea[] floor){
		
		for (int i = 0; i < floor.length; i++){
			
			switch (floor[i].getFloor()) {
			
			case 1:
				firstFloor.add(floor[i]);
				break;
			case 2:
				secondFloor.add(floor[i]);
				break;
			case 3:
				thirdFloor.add(floor[i]);
				break;
			case 4:
				fourthFloor.add(floor[i]);
				break;
			case 5:
				fifthFloor.add(floor[i]);
				break;
			default:
				System.out.println("Not a valid floor number");
			
			}	
		}
	}
	
	public String toString(){
		String firstFloor = "First Floor: No seats\n";
		String secondFloor = "Second Floor: No seats\n";
		String thirdFloor = "Third Floor: ";
		String fourthFloor = "Fourth Floor: ";
		String fifthFloor = "Fifth Floor: ";
		
		for (int i = 0; i < (this.thirdFloor).size(); i++){
			thirdFloor += ((this.thirdFloor).get(i) + "\n");
		}
		
		for (int i = 0; i < (this.fourthFloor).size(); i++){
			fourthFloor += ((this.fourthFloor).get(i) + "\n");
		}
		
		for (int i = 0; i < (this.fifthFloor).size(); i++){
			fifthFloor += ((this.fifthFloor).get(i) + "\n");
		}
		
		return firstFloor + "\n" + secondFloor + "\n" + thirdFloor + "\n" +
		fourthFloor + "\n" + fifthFloor;
	}
	
	// public void get()
	
	
}
