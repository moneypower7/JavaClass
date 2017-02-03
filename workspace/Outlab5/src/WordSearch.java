import java.util.Arrays;
import java.util.Scanner;

public class WordSearch {
	private char[][] array;
	private String Search;
	private String searchIndex = ""; // Holds the values of the array in one
										// string for later searching
	Scanner u = new Scanner(System.in);
	private int row, col;
	private boolean found = false;

	public WordSearch(char[][] inArray) {
		array = inArray;
		row = array.length;
		col = array[0].length;
	}

	// Plays the search and calls the other methods
	public void play() {
		Search = "start";
		while (!Search.equals("end")) {
			print();
			readIn();
			searchHoriz();
			searchVert();
			//Crawls through each row and column, I could not figure out how to do it with the method I was using for the other ones, so this method requires a loop
			for(int i = 0; i < array.length; i++)
	        {
	            for(int j = 0; j < array[0].length; j++)
	            {

	                
	                {
	                    searchDiag(i, j);
	                }
	            }
	        }
			if (!found){
				System.out.println(Search + " was not found!");
			}
		}
	}

	// Reads in the word we are searching for
	public void readIn() {
		System.out.println("What word do you want to search for? (Type end to quit)");
		Search = u.nextLine();
	}

	public void searchHoriz() { //Searches horizontally by creating a string from all of the characters in one row then searching through the string for a match
		for (int i = 0; i < row; i++) {
			searchIndex = "";
			for (int j = 0; j < col; j++) {
				searchIndex += array[i][j];
			}
			if (searchIndex.contains(Search)) {
				System.out.println(Search + " was found horizontally at row " + i + " and column "
						+ searchIndex.indexOf(Search) + "!");
				found = true;
			}
		}

	}

	public void searchVert() { //Searches vertically by creating a string from all of the characters in one column then searching through the string for a match
		for (int j = 0; j < col; j++) {
			searchIndex = "";
			for (int i = 0; i < row; i++) {
				searchIndex += array[i][j];
			}
			if (searchIndex.contains(Search)) {
				System.out.println(Search + " was found vertically at row " + searchIndex.indexOf(Search)
						+ " and column " + j + "!");
				found = true;
			}
		}
	}

	public void searchDiag(int row,int col) { //Searches diagonally by checking each individual character down and to the right of the found letter (that matches the first letter of the search word)
		int counter = 0; 
        row += 1;
        col += 1;
        for(int i = 0; i < Search.length(); i++)
        {
            if(row < array.length && col < array[0].length && counter < Search.length())
            {
                if(array[row][col] == Search.charAt(counter))
                {
                    counter += 1;
                    row += 1;
                    col +=1;
                }
            }
        }

        if(counter == Search.length())
        {
            System.out.println(Search + " found diagnolly at row " + (row - counter) + " and column " + (col - counter) + "!");
            found = true;
        }
		
	}
	
	

	public void print() {
		for (int i = 0; i < array.length; i++) {
			System.out.println(String.valueOf(array[i]));
		}
		System.out.println();
	}
}
