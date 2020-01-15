package com.ArraysPractice;

import java.util.Arrays;

public class SubarrayWithGivenSum {
	
	public static int SubarrayWithGivenSum_func(int arr[], int n, int sum) {
		//1st approach
	/*	int[] resultArr = new int[2];
		for(int i=0; i< arr.length-1; i++) {
			int sum=0;
			for(int j=i; j<= arr.length-1; j++) {			
				sum=sum+arr[j];
				if(sum==givenValue)
				{
					resultArr[0]=i+1;
					resultArr[1]=j+1;
					break;
				}
			}	
		}	
		return resultArr;	*/
		
		//2nd apprach
        int curr_sum = arr[0], start = 0, i; 
        // Pick a starting point 
        for (i = 1; i <= n; i++)  
        { 
            // If curr_sum exceeds the sum, then remove the starting elements 
            while (curr_sum > sum && start < i-1) 
            { 
                curr_sum = curr_sum - arr[start]; 
                start++; 
            }              
            // If curr_sum becomes equal to sum, then return true 
            if (curr_sum == sum)  
            { 
                int p = i-1; 
                System.out.println("Sum found between indexes " + start 
                        + " and " + p); 
                return 1; 
            } 
            // Add this element to curr_sum 
            if (i < n) {
            int x=i;
            int p=arr[x];
            int q=arr[i];
            curr_sum = curr_sum + arr[i]; 
            }
        } 
        System.out.println("No subarray found"); 
        return 0; 		
	}

	public static void main(String[] args) {
		int[] arr=new int[] {1,2,3,7,4};
		int n = arr.length; 
        int sum = 11; 
		SubarrayWithGivenSum_func(arr, n, sum);
		//System.out.println(Arrays.toString(resultArr));
	}
}
