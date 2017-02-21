
public class Node {
	private String name;
	protected Node next;
	public Node(String inName, Node next){
		next = null;
		name = inName;
		
	}
	public void setNext(Node n){
		next = n;
	}
	public Node getNext(){
		return next;
	}
	public void printName(){
		
	}
	public String getName(){
		return name;
	}
}
