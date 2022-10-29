package com.java.arrays;

public class ReverseWord {
	
	public static String reverseWord(String str) {
		char arr[] = str.toCharArray();
		int low = 0;
		int end = arr.length - 1;
		char temp = '\0';
		String output = "";
		while (low < end) {
			temp = arr[low];
			arr[low] = arr[end];
			arr[end] = temp;
			low++;
			end--;
		}

		for (char o : arr) {
			output += o;
		}
		return output;
	}
}