//*********************************************************************************************
//
//	Box.java					Author: Mike Piekarz
//
//	Lab: # 6					Exercise: #3
//
// 	Find the time complexity of the following Java method:
// 		
//*********************************************************************************************

//-----------------------------------------------------------------------------------------
// Exercise 3
// 	Find the time complexity of the following Java method:
/*
 	int bar(int N) {
 		int result = 1;
 		for (int i=1; i<N; i*=2)
 			result+=2;

 		return result;
}
*/
//-----------------------------------------------------------------------------------------

// The order for the above algorithm is O(log n) which the complexity is logarithmic
