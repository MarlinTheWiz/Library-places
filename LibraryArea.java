import java.util.Scanner;

public class LibraryArea {
	
	// Instance Variables
	private String areaName;
	private int floorNum;
	private boolean available; // True == available
	private int capacity;
	private int availableS; // Available seats
	private String type; // Single seat or table
	
	public LibraryArea (String areaName, int floorNum, int capacity, int availableS, String type){
		
		this.areaName = areaName;
		this.floorNum = floorNum;
		available = (availableS > 0);
		this.capacity = capacity;
		this.availableS = availableS;
		this.type = type;
		
	}
	
	public LibraryArea (String areaName, int floorNum, int capacity){
		
		this.areaName = areaName;
		this.floorNum = floorNum;
		available = true;
		this.capacity = capacity;
		type = "Seat";
	}
	
	public LibraryArea (String areaName, int floorNum, int capacity, String type){
		
		this.areaName = areaName;
		this.floorNum = floorNum;
		available = true;
		this.capacity = capacity;
		this.type = type;
	
	}
	
	// Add Getters and Setters
	public int getFloor(){
		return floorNum;
	}
	
}
