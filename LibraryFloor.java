import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryFloor {
	
	Scanner input = new Scanner(System.in);
	
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
	
	@SuppressWarnings("static-access")
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
	
	public LibraryArea getArea(){
		int fNum = input.nextInt();
		int area;
		LibraryArea a = new LibraryArea();
		
		switch (fNum) {
		
			case 1:
				for (int i = 0; i < firstFloor.size(); i++){
					System.out.println((firstFloor.get(i)).getAreaName());
				}
				area = input.nextInt();
				a = firstFloor.get(area);
				break;
			case 2:
				for (int i = 0; i < secondFloor.size(); i++){
					System.out.println((secondFloor.get(i)).getAreaName());
				}
				area = input.nextInt();
				a = secondFloor.get(area);
				break;
			case 3: 
				for (int i = 0; i < thirdFloor.size(); i++){
					System.out.println((thirdFloor.get(i)).getAreaName());
				}
				area = input.nextInt();
				a = thirdFloor.get(area);
				break;
			case 4:
				for (int i = 0; i < fourthFloor.size(); i++){
					System.out.println((fourthFloor.get(i)).getAreaName());
				}
				area = input.nextInt();
				a = fourthFloor.get(area);
				break;
			case 5:
				for (int i = 0; i < fifthFloor.size(); i++){
					System.out.println((fifthFloor.get(i)).getAreaName());
				}
				area = input.nextInt();
				a = fifthFloor.get(area);
				break;
			default:
				System.out.println("Invalid Area");
				
		}
		return a;
	}
	
	
}
