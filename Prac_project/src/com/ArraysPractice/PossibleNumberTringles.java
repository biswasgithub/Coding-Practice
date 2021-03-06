package com.ArraysPractice;

import java.util.Arrays;

public class PossibleNumberTringles {
	public static void main(String[] args) {
		int arr[] = new int[] {10, 21, 22, 100, 101, 200, 300};
		Arrays.sort(arr);
		int count = 0;
		int n =arr.length;
	    for (int i = 0; i < n-2; ++i)
	    {
	        for (int j = i+1; j < n; ++j)
	        {
	            int k = j+1;
	            while (k < n && arr[i] + arr[j] > arr[k]) 
	            {
	               k = k + 1;
	            }
	            count = count + k - j - 1;
	        }
	    }
		
		
		System.out.println(count);
	}
}
