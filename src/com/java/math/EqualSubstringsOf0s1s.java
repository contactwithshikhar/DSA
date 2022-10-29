package com.java.math;

public class EqualSubstringsOf0s1s {

//	Given a string A, A is made up of 0's and 1's. Break A into substrings such that , all broken substrings have equal number of 1's and 0's.
//
//	Find and return maximum number of substrings in which A can be broken.
//			
//			
//			For Example
//
//			Input 1:
//			    A = "011100"
//			Output 1:
//			    2
//			Explanation 1:
//			    "01" + "1100"
//
//			Input 2:
//			    A = "00011011"
//			Output 2:
//			    1
//			Explanation 2:
//			    "00011011"

	public int solve(String A) {
		int count = 0;
		int count_zero = 0;
		int count_one = 0;
		for (int i = 0; i < A.length(); i++) {
			if (String.valueOf(A.charAt(i)).equals("0"))
				count_zero++;
			else if (String.valueOf(A.charAt(i)).equals("1"))
				count_one++;
			if (count_zero == count_one) {
				count++;
				count_zero = 0;
				count_one = 0;
			}

		}
		return count;

	}

}
