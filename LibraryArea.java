import java.util.Scanner;

public class LibraryArea {
	
	// Instance Variables
	private String areaName;
	private int floorNum;
	private boolean available; // True == available
	private int capacity;
	private int availableS; // Available seats
	
	
	
	public LibraryArea (String areaName, int floorNum, int capacity, int availableS){
		
		this.areaName = areaName;
		this.floorNum = floorNum;
		available = (availableS > 0);
		this.capacity = capacity;
		this.availableS = availableS;
		
	}
	
	public LibraryArea (String areaName, int floorNum, int capacity){
		
		this.areaName = areaName;
		this.floorNum = floorNum;
		available = true;
		this.capacity = capacity;
	}
	
	
	
}
