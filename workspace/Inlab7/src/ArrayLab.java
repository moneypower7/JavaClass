import java.util.Random;

public class ArrayLab {
	int[] array;

	//Methods, does commenting earn me points?
	public ArrayLab(int inSize) {
		array = new int[inSize];
	}

	public void initialize() {
		Random rand = new Random();
		int n = 0;
		while (n < array.length) {
			array[n] = rand.nextInt(10);
			n++;
		}

	}

	public void print() {
		int n = 0;
		while (n < array.length) {
			System.out.print(array[n] + ",");
			n++;
		}
		System.out.println();
		System.out.println();
	}
	//
	public void printStats(){
		int n = 0;
		int sum = 0;
		int maximum = -1;
		int minimum = 11;
		while (n < array.length) {
			sum+=array[n];
			if (array[n]>maximum){
				maximum = array[n];
			}
			if (array[n]<minimum){
				minimum = array[n];
			}
			n++;
		}
		System.out.println("Average Value: " + (double)sum/array.length);
		System.out.println("Maximum Value: " + maximum);
		System.out.println("Minimum Value: " + minimum);
	}
	public void search(int inSearch){
		int n = 0;
		boolean found;
		found = false;
		while (n < array.length) {
			if (array[n]==inSearch){
				found = true;
			}
			n++;
		}
		if (found){
			System.out.println(inSearch + " was found.");
		}else{
			System.out.println(inSearch + " was not found.");
		}
	}
}
