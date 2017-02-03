
/**
 * Driver for Inlab10.
 * 
 * @author yaw
 * @version 22 Nov 2016
 * 
 */
public class Driver
{
   public static void main(String[] args)
   {
       int[] one = {2, 4, 6, 1, 6, 3, 8};
       int[] two = {43, 76, 3, 23, 95, 23};
       int[] three = {9, 8, 7, 6, 5, 4, 3, 2, 1};
       
       Recursion.print(one);
       System.out.println("Smallest: " + Recursion.smallest(one));
       System.out.println("Index of Smallest: " + Recursion.smallestIndex(one));
       System.out.println();
       
       Recursion.print(two);
       System.out.println("Smallest: " + Recursion.smallest(two));
       System.out.println("Index of Smallest: " + Recursion.smallestIndex(two));
       System.out.println();
       
       Recursion.print(three);
       System.out.println("Smallest: " + Recursion.smallest(three));
       System.out.println("Index of Smallest: " + Recursion.smallestIndex(three));
       System.out.println();
    }
}