//*********************************************************************************************
//
//	Box.java					Author: Mike Piekarz
//
//	Lab: # 6					Exercise: #5 Selection Sort
//
// 	Utilize Selection Sort on array and print out each iteration of the outer loop
// 		
//*********************************************************************************************

//-----------------------------------------------------------------------------------------
// Exercise 5
//	Trace the execution of the insertion and selection sort algorithms when executed on the
//	following array of integers:
//	{1, 29, 14, 15, 94}
//	Show how the array will look like after each iteration of the outer loop.
//-----------------------------------------------------------------------------------------

public class Exercise5_SelectionSort {

	public static void main(String[] args) {
		// Declare and initializes variables
		int[] array = { 1, 29, 14, 15, 94 };
		int oLoop, iLoop, minValue, minIndex, temp = 0;

		// Create for loop to perform search of the targeted value utilizing Selection
		// Sort
		for (oLoop = 0; oLoop < array.length; oLoop++) {
			// Declare and initializes variables needed for the inner loop
			minValue = array[oLoop];
			minIndex = oLoop;

			// Create an inner for loop to set minimum value and swap values
			for (iLoop = oLoop; iLoop < array.length; iLoop++) {
				if (array[iLoop] < minValue) {
					minValue = array[iLoop];
					minIndex = iLoop;
				}
				// Swap values into ascending order
				if (minValue < array[oLoop]) {
					temp = array[oLoop];
					array[oLoop] = array[minIndex];
					array[minIndex] = temp;
				}
			}

			// Print out array after each iteration of the outer loop
			for (int index : array)
				System.out.print(index + ",");
			System.out.println("\n---------------");
		}
	}

}

/*
Print out of the array after each iteration of the outer loop
1,29,14,15,94,
---------------
1,14,29,15,94,
---------------
1,14,15,29,94,
---------------
1,14,15,29,94,
---------------
1,14,15,29,94,
---------------
 */
