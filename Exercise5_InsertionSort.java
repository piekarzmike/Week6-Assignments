//*********************************************************************************************
//
//	Box.java					Author: Mike Piekarz
//
//	Lab: # 6					Exercise: #5 Insertion Sort
//
// 	Utilize Insertion Sort on array and print out each iteration of the outer loop
// 		
//*********************************************************************************************

//-----------------------------------------------------------------------------------------
// Exercise 5
//	Trace the execution of the insertion and selection sort algorithms when executed on the
//	following array of integers:
//	{1, 29, 14, 15, 94}
//	Show how the array will look like after each iteration of the outer loop.
//-----------------------------------------------------------------------------------------

public class Exercise5_InsertionSort {

	public static void main(String[] args) {
		// Declare and initializes variables
		int [] array = {1, 29, 14, 15, 94};
		int oLoop, iLoop, key, temp;

		// Create for loop to perform search of the targeted value utilizing Inser
		for (oLoop=1; oLoop < array.length; oLoop++) {
			// Declare and initializes variables needed for the inner loop
			key = array[oLoop];
			iLoop = oLoop-1;
		
			// Create while loop to iterate through the array and swap values into ascending order 
			while (iLoop>=0 && key<array[iLoop]) {
				 temp = array[iLoop];
				 array[iLoop]=array[iLoop+1];
				 array[iLoop+1]=temp;
				 iLoop--;	
			}
			
			// Print out array after each iteration of the outer loop
			for (int index: array)
			System.out.print(index + ",");
			System.out.println("\n--------------");
		}	
	}
	
}

/*
 Print out of the array after each iteration of the outer loop
1,29,14,15,94,
--------------
1,14,29,15,94,
--------------
1,14,15,29,94,
--------------
1,14,15,29,94,
--------------
*/