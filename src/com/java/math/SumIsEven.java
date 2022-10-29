package com.java.math;

public class SumIsEven {

	// Given an array of integers A, find and return the minimum elements to be
	// removed such that in the resulting array the sum of any two adjacent values
	// is even.

	
	// Return the minimum number of elements to be removed.

	
    public int solve(int[] A) {
        int odd = 0;
        int even =0;

        for(int num : A){
            if (num%2 ==0 )
            even++;
            else 
            odd ++;
        }

        if (even > odd)
        return odd;

        return even ;
    }
	
}
