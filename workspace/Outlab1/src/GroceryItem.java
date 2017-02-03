
/**
 * This is a class to represent students.
 * 
 * @author Troy Oster 
 * @version 07 Sep 2016
 */
public class GroceryItem {
	//instance variable(s)
	private String name;
	private double cost;
	private int aisleNum;
	//Constructor
	public GroceryItem(String inName, double inCost, int inAisleNum){
		name = inName;
		cost = inCost;
		aisleNum = inAisleNum;
	}
	//Methods
	//Returns the name of the grocery item
	public String getName(){
		return name;
	}
	//Returns the cost of the grocery item
	public double getCost(){
		return cost;
	}
	//Returns the aisle number of the grocery item
	public int getAisle(){
		return aisleNum;
	}
	//Changes the cost of the grocery item without returning a value
	public void changeCost(double inCost){
		cost = inCost;
	}
}

