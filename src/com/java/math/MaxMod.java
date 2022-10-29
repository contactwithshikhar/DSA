package com.java.math;

public class MaxMod {
	
	
	// Return an integer denoting the maximum value of A[i] % A[j] for any valid i, j.

	public static int solve(int[] A) {
        int max = 0;
        int second_max = 0; 

        for (int num : A){
            if(num > max){
                second_max = max; 
                max = num;
            }
            else if (num >second_max && num < max)
                second_max = num ; 
        }
        return second_max%max ;
    }
	
	public static void main(String[] args) {
		

		int arr [] = {1,2,44,3};
		int arr2 [] = {2, 6, 4};
		
		int solve = solve(arr);
		int solve2 = solve(arr2);
		
		System.out.println(solve); // 3
		System.out.println(solve2);  // 4
		
		
	}
	
	
}
