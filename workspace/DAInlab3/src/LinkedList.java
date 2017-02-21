import java.util.*;
public class LinkedList {
	Node start;
	Node end;
	Scanner u = new Scanner(System.in);
	int userChoice,size;
	String nameEntered;
	public LinkedList(){
		start = null;
		end = null;
		size = 0;
	}
	public void menu(){
		do{
			System.out.println("What would you like to do?");
			System.out.println("Press 1 to add an item");
			System.out.println("Press 2 to print the list");
			System.out.println("Press 3 to delete an item");
			System.out.println("Press 4 to clear the whole list");
			System.out.println("Press -1 to exit");
			userChoice = u.nextInt();
			u.nextLine();
			switch (userChoice){
			case 1:
				System.out.println("Enter a name to add");
				nameEntered = u.nextLine();
				addItem(nameEntered);
				break;
				
			case 2:
				printList();
				break;
			case 3:
				System.out.println("Please enter the position of the item you would like to delete");
				userChoice = u.nextInt();
				u.nextLine();
				deleteItem(userChoice);
				break;
				
			}
		}while(userChoice!=-1);
	}
	public void addItem(String name){
		Node newItem = new Node(name, null);    
        size++ ;    
        if(start == null) 
        {
            start = newItem;
            end = start;
        }
        else 
        {
            newItem.setNext(start);
            start = newItem;
        }
	}
	public void printList(){
		System.out.print("\nThe List is as follows: ");
        if (size == 0) 
        {
            System.out.print("empty\n");
            return;
        }    
        if (start.getNext() == null) 
        {
            System.out.println(start.getName() );
            return;
        }
        Node print = start;
        System.out.print(start.getName()+ "->");
        print = start.getNext();
        while (print.getNext() != null)
        {
            System.out.print(print.getName()+ "->");
            print = print.getNext();
        }
        System.out.print(print.getName()+ "\n");
    }
	public void deleteItem(int pos){
		if (pos == 1) 
        {
            start = start.getNext();
            size--; 
            return ;
        }
        if (pos == size) 
        {
            Node s = start;
            Node t = start;
            while (s != end)
            {
                t = s;
                s = s.getNext();
            }
            end = t;
            end.setNext(null);
            size --;
            return;
        }
        Node ptr = start;
        pos = pos - 1 ;
        for (int i = 1; i < size - 1; i++) 
        {
            if (i == pos) 
            {
                Node tmp = ptr.getNext();
                tmp = tmp.getNext();
                ptr.setNext(tmp);
                break;
            }
            ptr = ptr.getNext();
        }
        size-- ;
    }

	public void clearList(){ //How?
		Node temp;
		while (start != null){
		    temp = start.getNext();
		    start.setNext(null);
		    start = temp;
		}
	}
	
}
