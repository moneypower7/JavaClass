import java.util.Random;

public class Array {
	// Instance Variables
	int[] array1; // integer array
	// Constructor that declares the size of the array

	public Array(int inSize) {
		array1 = new int[inSize];
	}

	public void fill() {
		Random rand = new Random();
		int n = 0;
		while (n < array1.length) {
			array1[n] = rand.nextInt(10);
			n++;
		}
	}
	
	public void print() {//Printing Method
		for (int n = 0; n < array1.length*2+1; n++) {
			System.out.print("-");
		}
		System.out.println();
		for (int n = 0; n < array1.length; n++) {
			System.out.print("|" + array1[n]);
		}
		System.out.print("|");
		System.out.println();
		for (int n = 0; n < array1.length*2+1; n++) {
			System.out.print("-");
		}
		System.out.println();
	}
	
	public void sort() { //Simple bubble sort method using nested for loops
		int tempVar; //Temporary variable to hold the value while the sorting takes place
		int n = array1.length;

	    for (int i = 0; i < n; i++) {
	        for (int j = 1; j < (n - i); j++) {

	            if (array1[j - 1] > array1[j]) {
	                tempVar = array1[j - 1];
	                array1[j - 1] = array1[j];
	                array1[j] = tempVar;
	            }

	        }
	    }
	}

}
