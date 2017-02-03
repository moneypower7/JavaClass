
public class Ship {
	//Instance variables
	private int fuelCapacity;
	double fuelConsumed, currentFuel;
	private String name;
	//Constructor
	public Ship(String inName, int inFuelCap){
		name = inName;
		fuelCapacity = inFuelCap;
		currentFuel = inFuelCap; //currentFuel keeps track of how much fuel the ship currently has, as not to change the fuel capacity
		fuelConsumed = 0;
	}
	//Methods
	//Reduces the amount of fuel on board (currentFuel) to half and keeps track of the total number of fuel units that the ship has consumed throughout its existence
	public void useFuel(){
		currentFuel /= 2;
		fuelConsumed += currentFuel;
	}
	//Refuels the ship
	public void reFuel(){
		currentFuel = fuelCapacity;
	}
	//Prints the name of the ship and how many units of fuel that ship has consumed in its existence
	public void print(){
		System.out.println(name + " has consumed " + fuelConsumed + " units of fuel throughout its existence.");
	}
	
	
}
