//*********************************************************************************************
//
//	Box.java					Author: Mike Piekarz
//
//	Lab: # 6					Exercise: #1
//
// 	Utilize Insertion Sort on array and print out each iteration of the outer loop
// 		
//*********************************************************************************************

//-----------------------------------------------------------------------------------------
// Exercise 1
//	Write the simplest Java method that would have O(N3) time complexity, where N is the single
//	input parameter to the method.
//-----------------------------------------------------------------------------------------
public class Exercise1 {

	public static void main(String[] args) {
		test(1);
	}

	public static void test(int N) {
	
		for (int a=0; a < N; a++) {
			for(int b=0; b < N; b++) {
				for(int c=0; c < N; c++) {
				}
			}
		}
	
	}
}
