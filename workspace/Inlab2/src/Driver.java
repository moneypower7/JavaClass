/**
 * @author Troy Oster
 * @version 11 Sept 2016
 */
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1;
		Book book2;
		book1 = new Book("Dracula",22,7.55);
		book2 = new Book("The Hitchhiker's Guide to the Galaxy",100,5.55);
		System.out.println(book1.getTitle() + " costs $" + book1.getCost() + " and there are " + book1.getStock()
			+ " books in stock, the toal value of this current book in stock is $" + book1.totalValue()+"0");
		System.out.println();
		System.out.println(book2.getTitle() + " costs $" + book2.getCost() + " and there are " + book2.getStock()
			+ " books in stock, the toal value of this current book in stock is $" + book2.totalValue()+"0");
	}

}
