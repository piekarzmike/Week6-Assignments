//*********************************************************************************************
//
//	Box.java					Author: Mike Piekarz
//
//	Lab: # 6					Exercise: #2
//
// 	Find the time complexity of the following Java method:
// 		
//*********************************************************************************************

//-----------------------------------------------------------------------------------------
// Exercise 2
// 	Find the time complexity of the following Java method:
/*
	int foo(int N) {
		int result = 0;
		for (int i = 0; i < N; i++)
			result++;
		for (int j = 0; j < 1000000; j++)
			result += j;

		return result;
	}
*/
//-----------------------------------------------------------------------------------------

// The order for the above algorithm is O(n) which the complexity is linear
