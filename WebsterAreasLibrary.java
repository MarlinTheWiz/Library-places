
public class WebsterAreasLibrary {
	
	public static void main(String[] args) {
		
		// Where to find all the area names
		// http://library.concordia.ca/locations/floor-plans.php?guid=web3
		
		// Third floor Library areas
		LibraryArea france = new LibraryArea("France", 3, 144);
		LibraryArea india = new LibraryArea("India", 3, 144);
		LibraryArea collabFloor3 = new LibraryArea("Collaborative Area", 3, 50);
		LibraryArea[] floor_3 = {france, india, collabFloor3};
		// Maybe this whole process is useless and I don't need to define LibraryFloor
		LibraryFloor floor3 = new LibraryFloor(floor_3, 3);
		
		// Fourth floor Library areas
		LibraryArea collabFloor4 = new LibraryArea("Collaborative Area", 4, 50, "tables");
		
		// Fifth floor Library areas
		LibraryArea collabFloor5 = new LibraryArea("Collaborative Area", 5, 12, "tables");
		LibraryArea nepal = new LibraryArea("Nepal", 5, 200);
		LibraryArea argentina = new LibraryArea("Argentina", 5, 200);
		
	}
	
}
