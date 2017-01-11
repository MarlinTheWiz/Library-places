
public class WebsterAreasLibrary {
	
	public static void main(String[] args) {
		
		// Where to find all the area names
		// http://library.concordia.ca/locations/floor-plans.php?guid=web3
		
		// Third floor Library areas
		LibraryArea france = new LibraryArea("France", 3, 144);
		LibraryArea india = new LibraryArea("India", 3, 144);
		LibraryArea collabFloor3 = new LibraryArea("Collaborative Area", 3, 50);
		
		// Maybe this whole process is useless and I don't need to define LibraryFloor
		
		// Fourth floor Library areas
		LibraryArea collabFloor4 = new LibraryArea("Collaborative Area", 4, 80, "tables");
		
		// Fifth floor Library areas
		LibraryArea collabFloor5 = new LibraryArea("Collaborative Area", 5, 12, "tables");
		LibraryArea nepal = new LibraryArea("Nepal", 5, 200);
		LibraryArea argentina = new LibraryArea("Argentina", 5, 200);
		LibraryArea spain = new LibraryArea("Spain", 5, 200);
		LibraryArea greenCouches = new LibraryArea("Small Collaborative Area", 5, 6, "small green couches");
		
		// Array of all Library areas
		LibraryArea[] floor = {france, india, collabFloor3, collabFloor4, collabFloor5,
				nepal, argentina, spain, greenCouches};
		LibraryFloor library = new LibraryFloor(floor);
		
		System.out.print(library.getArea());
	}
	
}
