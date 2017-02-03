

/**
 * Recursion.
 * 
 * @author yaw 
 * @version 22 Nov 2016
 */
public class Recursion
{
	//counter variable, and holds smallest number
	private static int smallestNum = 1000;
	private static int newStart,index;
    public static void print(int[] array)
    {
    	for (int i = 0; i < array.length; i++) {
            if (i > 0) {
               System.out.print(", ");
            }
            System.out.print(array[i]);
         }
    	System.out.println();
    }
    
    public static int smallest(int[] array)
    {
        return smallestFrom(array, 0);
    }
    
    private static int smallestFrom(int[] array, int start)
    {
       if (array[start]<smallestNum){
    	   smallestNum = array[start]; //keeps track of smallest number
    	   index = start; //keeps track of the index of the smallest number
       }
       newStart = start+1;
       if (newStart < array.length){ //if there is more to the array it calls the method again
    	   smallestFrom(array, newStart);
       }
       return smallestNum;
    }
    
    public static int smallestIndex(int[] array)
    {
        return smallestIndexFrom(array, 0);
    }
    
    private static int smallestIndexFrom(int[] array, int start)
    {
        smallestNum = 1000; //Resets the smallest number
        return index;
    }
}