package com.java.arrays;

public class FindMinMaxSum {
	
	
//			N = 5
//			A[] = {-2, 1, -4, 5, 3}
//			Output: 1
//			Explanation: min = -4, max =  5. Sum = -4 + 5 = 1

	
    public static int findSum(int A[],int N) 
    {
    
        int min=A[0],max =A[1];
        
        
          //  min -2 
        // max 1 
        
        for(int num : A){
            if(num > max){
                max = num;
            }
            if(num < max && num<min){
                min = num;
            }
          
        }
        
        return min+max;
    }
}
