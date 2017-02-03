/**
 * GroceryItem Inlab.
 * 
 * @author Troy Oster
 * @version 19 Sep 2016
 */
public class GroceryItem
{
    private String name;        //item name
    private double cost;        //cost of 1 unit of item
    private int stock;
    // constructor for GroceryItems
    public GroceryItem(String inName, double inCost, int inStock)
    {
        name = inName;
        cost = inCost;
        stock = inStock;
    }
    
    // returns the item's name
    public String getName()
    {
        return name;
    }
    
    // returns the cost of 1 item
    public double getCost()
    {
        return cost;
    }
    //Updates the number of that item in stock
    public void updateStock(int inPurchased){
    	stock -= inPurchased;
    }
    public void printInventory(){
    	System.out.println("There are " + stock + " units of " + name + " in stock");
    }
}