# Library-places

1)	LibraryArea Class (does this only work for the silent study areas?? What about group tables??)
•	This class defines what an area in the library should be composed of:
1-	An Area name
2-	What floor the area is on
3-	How many students the area can hold
4-	How many seats are available
5-	A Boolean variable saying whether there is place for user or not
•	LibraryArea (String areaName, int floorNum, int capacity, int availableS)
A constructor that creates a library area setting variables 1 to 4 and 5 according to 4 being bigger than 0
•	Getters and Setters
•	toString () 
If there are available seats, return: “There is approximately ” + availableS + “ seats in “  + areaName
If there are no seats available (Boolean == false), return: “There is probably no available seats in “ + areaName 

2)	WebsterAreaLibrary Class
•	This class will contain all the areas of the Webster library (a library of library area). So it should contain/be composed of arrays differentiated by floors. (OR should the whole library be a multi-dimensional array??)
•	Some method that will add areas to the appropriate arrays by checking their floor number? 
•	WebsterAreaLibrary ( int floor, int area )
Prints? Or accesses the area specified by the floor and its index in the array
