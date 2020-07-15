package com.ArraysPractice;

import java.util.Arrays;

public class InversionOfArray1 {

	private static int mergeAndCount(int[] arr, int left,int right) {

		int mid = (left+right)/2;
		System.out.println(mid);
		// Left subarray
		int[] leftArray = Arrays.copyOfRange(arr, left, mid + 1);
		
		System.out.println(Arrays.toString(leftArray));

		// Right subarray
		int[] rightArray = Arrays.copyOfRange(arr, mid + 1, right + 1);

		int i = 0, j = 0, k = left, swaps = 0;

		while (i < leftArray.length && j < rightArray.length) {
			if (leftArray[i] <= rightArray[j])
				arr[k++] = leftArray[i++];
			else {
				arr[k++] = rightArray[j++];
				//swaps += (mid + 1) - (left + i);
				swaps+=(mid+1)-i;
			}
		}

		// Fill from the rest of the left subarray
		while (i < leftArray.length)
			arr[k++] = leftArray[i++];

		// Fill from the rest of the right subarray
		while (j < rightArray.length)
			arr[k++] = rightArray[j++];

		System.out.println(Arrays.toString(arr));
		
		return swaps;
	}

	public static void main(String[] args) {
		int[] arr = { 1,3,5,2,4,6 };

		System.out.println(mergeAndCount(arr, 0, arr.length - 1));
	}
}
