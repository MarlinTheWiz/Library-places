import java.util.Scanner;

public class Library_Areas {
	
	// String arrays for each floor and their study areas
		private String[] floorNames = {"1st Floor", "2nd Floor", "3rd Floor", "4th Floor",
				"5th Floor"};
		private String[] secondFloorNames = {""};
		private String[] thirdFloorNames = {"Silent Study 1", "Sofa Silent Study", 
				"Silent Study 2"};
		private String[] fourthFloorNames = {"Group Study Area", "", ""};
		private String[] fifthFloorNames = {"Blue Chairs Area", "Green Sofas Area", 
				"Silent Study 1", "Silent Study 2"};
		
		/* Boolean arrays matched with each area on each floor to simply say if there's
		 * probably space or not
		 */
		private boolean[] secondFloorBool = new boolean[secondFloorNames.length];
		private boolean[] thirdFloorBool = new boolean[thirdFloorNames.length];
		private boolean[] fourthFloorBool = new boolean[fourthFloorNames.length];
		private boolean[] fifthFloorBool = new boolean[fifthFloorNames.length];
		
		/* Insert Here 
		 * Integer arrays for possible future use? 
		 * (more accurately tell the user how many spaces there should be)
		 */
		
		Scanner input = new Scanner(System.in);
		
		// Method that sets all boolean array values to true to indicate the library is free
		public void emptyLibrary(){
			
			for (int i = 0; i < secondFloorBool.length; i++){
				secondFloorBool[i] = true;
			}
			for (int i = 0; i < thirdFloorBool.length; i++){
				thirdFloorBool[i] = true;
			}
			for (int i = 0; i < fourthFloorBool.length; i++){
				fourthFloorBool[i] = true;
			}
			for (int i = 0; i < fifthFloorBool.length; i++){
				fifthFloorBool[i] = true;
			}
			/* Think about a more efficient way to set every value to true 
			 * (maybe use a while loop + counter)
			 */
			
		}
		
		// Opposite of previous method
		public void fullLibrary(){
			
			for (int i = 0; i < secondFloorBool.length; i++){
				secondFloorBool[i] = false;
			}
			for (int i = 0; i < thirdFloorBool.length; i++){
				thirdFloorBool[i] = false;
			}
			for (int i = 0; i < fourthFloorBool.length; i++){
				fourthFloorBool[i] = false;
			}
			for (int i = 0; i < fifthFloorBool.length; i++){
				fifthFloorBool[i] = false;
			}
			
		}
		
		// Goes through the array and tells the user what areas are free
		public String isFree(){
			
			String freeAreas = "Second FLoor: "; // Fix this! maybe making a string variable for every floor would be more useful
			
			for (int i = 0; i < secondFloorBool.length; i++){
				if(secondFloorBool[i] == true)
					freeAreas += secondFloorNames[i] + "\t";
			}
			freeAreas += "\nThird Floor: ";
			for (int i = 0; i < thirdFloorBool.length; i++){
				if(thirdFloorBool[i] == true)
					freeAreas += thirdFloorNames[i] + "\t";
			}
			freeAreas += "\nFourth Floor: ";
			for (int i = 0; i < fourthFloorBool.length; i++){
				if(fourthFloorBool[i] == true)
					freeAreas += fourthFloorNames[i] + "\t";
			}
			freeAreas += "\nFifth Floor: ";
			for (int i = 0; i < fifthFloorBool.length; i++){
				if(fifthFloorBool[i] == true)
					freeAreas += fifthFloorNames[i] + "\t";
			}
			
			return freeAreas;
		}
		
		// isFree but specifically goes through that floor that the user is asking for
		public String isFree(boolean[] floorArray){
			String area = "";
			for(int i = 0; i < floorArray.length; i++){
				if(floorArray[i] == true)
					return area = "Free";
			}
			return area;
		}
		
		public String toString(){
			return "???";
		}
		
		

}
