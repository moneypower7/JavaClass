
public class Fleet {
	//Instance variable to represent how much fuel a ship has
	private Ship ship1;
	private Ship ship2;
	private Ship ship3;
	private Ship ship4;
	//Constructor
	public Fleet(Ship inShip1, Ship inShip2, Ship inShip3, Ship inShip4){
		ship1 = inShip1;
		ship2 = inShip2;
		ship3 = inShip3;
		ship4 = inShip4;
	}
	//Refuels each ship
	public void reFuel(){
		ship1.reFuel();
		ship2.reFuel();
		ship3.reFuel();
		ship4.reFuel();
	}
	//Deploys each ship
	public void deploy(){
		ship1.useFuel();
		ship2.useFuel();
		ship3.useFuel();
		ship4.useFuel();
	}
	//Calls the print function within each ship, printing the number of units of fuel each ship has consumed throughout its existance
	public void printSummary(){
		System.out.println("The summary is as follows:");
		System.out.println();
		ship1.print();
		ship2.print();
		ship3.print();
		ship4.print();
	}
}
