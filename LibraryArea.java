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
		type = "seats";
	}
	
	public LibraryArea (String areaName, int floorNum, int capacity, String type){
		
		this.areaName = areaName;
		this.floorNum = floorNum;
		available = true;
		this.capacity = capacity;
		this.type = type;
	
	}
	
	
	// Getters
	
	public String getAreaName(){
		return areaName;
	}
	
	public int getFloor(){
		return floorNum;
	}
	
	public boolean getAvailability(){
		return available;
	}
	
	public int getCapacity(){
		return capacity;
	}
	
	public int getAvailableSeats(){
		return availableS;
	}
	
	public String getSeatType(){
		return type;
	}
	
	
	// Method to set x amount of free seats in an area (the only useful setter?)
	public void setAvailableSeats(int seats){
		availableS = seats;
	}
	
	public String toString(){
		return areaName + " has " + availableS + " free " + type; 
	}
	
}
