
public class Cart {
	//Instance Variables
	private String shopperName;
	private int itemQuantity1, itemQuantity2;
	private double item1Cost, item2Cost, subTotal;
	private GroceryItem item1;
	private GroceryItem item2;
	//Constructor
	public Cart(String inName){
		shopperName = inName;
	}
	//Methods
	public void addItem1(GroceryItem inItem, int inQuantity1){
		item1 = inItem;
		itemQuantity1 = inQuantity1;
		item1Cost = item1.getCost() * itemQuantity1; //Calculates the total cost of item 1
		item1.updateStock(itemQuantity1);
	}
	public void addItem2(GroceryItem inItem, int inQuantity2){
		item2 = inItem;
		itemQuantity2 = inQuantity2;
		item2Cost = item2.getCost() * itemQuantity2; //Calculates the total cost of item 2 
		item2.updateStock(itemQuantity2);
	}
	public void printReceipt(){
		subTotal = item1Cost + item2Cost;
		System.out.println("Shopper name: " + shopperName);
		System.out.println("----------------------");
		System.out.println(item1.getName() + ": " + itemQuantity1 + " at $" + item1.getCost() + " per unit = " + item1Cost);
		System.out.println(item2.getName() + ": " + itemQuantity2 + " at $" + item2.getCost() + " per unit = " + item2Cost);
		System.out.println("   ----> SubTotal = $" + subTotal);
		System.out.println("   ----> 7% tax = $" + (subTotal * .07));
		System.out.println("   ----> Total = $" + (subTotal * 1.07));
		System.out.println();
		System.out.println();
		
	}
	
}
