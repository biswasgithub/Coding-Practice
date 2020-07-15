package com.ArraysPractice;

import java.util.Arrays;

public class InversionOfArray {
	


	// Function to count the number of inversions 
	// during the merge process 
	private static int mergeAndCount(int[] arr, int left, int mid, int right) 
	{ 
		int[] tempArray=new int[arr.length];
		// Left subarray 
		int[] leftArray = Arrays.copyOfRange(arr, left, mid + 1); 

		// Right subarray 
		int[] rightArray = Arrays.copyOfRange(arr, mid + 1, right + 1); 

		int i = 0, j = 0, k = left, swaps = 0; 

		while (i < leftArray.length && j < rightArray.length) { 
			if (leftArray[i] <= rightArray[j]) {
				arr[k] = leftArray[i++]; 
				tempArray[k]=arr[k];
			}
			else { 
				arr[k] = rightArray[j++]; 
				tempArray[k]=arr[k];

				swaps += (mid + 1) - (left + i); 
			}
			k++;
		} 

		// Fill from the rest of the left subarray 
		while (i < leftArray.length) 
		{
			arr[k] = leftArray[i++]; 
			tempArray[k]=arr[k];
			k++;
		} 

		// Fill from the rest of the right subarray 
		while (j < rightArray.length) 
		{
			arr[k] = rightArray[j++]; 
			tempArray[k]=arr[k];
			k++;
		} 
		
		
		return swaps; 
	} 

	// Merge sort function 
	private static int mergeSortAndCount(int[] arr, int left, int right) 
	{ 

		// Keeps track of the inversion count at a 
		// particular node of the recursion tree 
		int count = 0; 

		if (left < right) { 
			int mid = (left + right) / 2; 

			// Total inversion count = left subarray count 
			// + right subarray count + merge count 

			// Left subarray count 
			count += mergeSortAndCount(arr, left, mid); 

			// Right subarray count 
			count += mergeSortAndCount(arr, mid + 1, right); 

			// Merge count 
			count += mergeAndCount(arr, left, mid, right); 
		} 

		return count; 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		int[] arr = { 2,4,6,1,8,5,3,7}; 

		System.out.println(mergeSortAndCount(arr, 0, arr.length - 1)); 
	} 

}
