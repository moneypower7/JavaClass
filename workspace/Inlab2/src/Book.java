
public class Book {
	private String title;
	private int stock;
	private double cost;
	//Constructor
	public Book(String inTitle,int inStock,double inCost){
		title = inTitle;
		stock = inStock;
		cost = inCost;
	}
	//Methods
	public String getTitle(){//Returns the title
		return title;
	}
	public int getStock(){//Returns the stock
		return stock;
	}
	public double getCost(){//Returns the cost
		return cost;
	}
	public double totalValue(){//Returns the total value of the book the store has in stock
		return (stock*cost);
	}
}
