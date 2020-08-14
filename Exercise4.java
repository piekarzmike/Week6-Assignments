//*********************************************************************************************
//
//	Box.java					Author: Mike Piekarz
//
//	Lab: # 6					Exercise: #4 t
//
//  Perform a Binary search and print out the middle value and the left and right bound indexes for each iteration
// 		
//*********************************************************************************************

//-----------------------------------------------------------------------------------------
// Exercise 4
//	Assume a binary search is performed on the following array of integers:
//	{1, 14, 15, 24, 55, 59, 73, 90, 94, 99}
//	Trace through each iteration of the algorithm, writing the number that will be the middle
//	element and the left and right bounds (indexes), when searching for the number 73.-------------
//-----------------------------------------------------------------------------------------

public class Exercise4 {

	public static void main(String[] args) {
		// Declare and initializes variables
		int[] array = { 1, 14, 15, 24, 55, 59, 73, 90, 94, 99 };
		int left = 0;
		int right = array.length - 1;
		int target = 73;

		// Create while loop to perform search of the targeted value utilizing the Binary Search algorithm
		while (!(left == right)) {
			
			// Declare and initialize the middle index value of the array through each iteration of the loop
			int middle = (left + right) / 2; 	
			
			// Print out the middle element of the array and the left and righ bound indexes through each iteration of the loop till the target value is located. 
			System.out.println("Middle Element: " + array[middle] + ", Left Bound Index: " + left + ", Right Bound Index: " + right);
			
			if (target < array[middle]) { // If target value is less than the middle value set right index to the middle index minus 1 of the array 
				right = middle - 1;
			} else if (target > array[middle]) { // If target value is greater than the middle value set left index to the middle index plus 1 of the array
				left = middle + 1;
			}
		}
		//Print out Target Value and the associated left and right bound indexes.
		System.out.println("Middle Element: " + target + ", Left Bound Index: " + left + ", Right Bound Index: " + right);
	}

}

/*
Print out of the Middle element and the left and right bound indexes after each iteration
Middle Element: 55, Left Bound Index: 0, Right Bound Index: 9
Middle Element: 90, Left Bound Index: 5, Right Bound Index: 9
Middle Element: 59, Left Bound Index: 5, Right Bound Index: 6
Middle Element: 73, Left Bound Index: 6, Right Bound Index: 6
*/