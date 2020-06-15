package com.ArraysPractice;

import java.util.Arrays;

class InversionCount
{
	// Merge two sorted subarrays arr[low .. mid] and arr[mid + 1 .. high]
	public static int merge(int[] arr, int[] aux, int low, int high)
	{
		int mid=(low+high)/2;
		int k = low, i = low, j = mid + 1;
		int inversionCount = 0;
		
		// While there are elements in the left and right runs
		while (i <= mid && j <= high)
		{
			if (arr[i] <= arr[j]) {
				aux[k++] = arr[i++];
			}
			else {
				aux[k++] = arr[j++];
				inversionCount += (mid - i + 1);	// NOTE
			}
		}

		// Copy remaining elements
		while (i <= mid)
			aux[k++] = arr[i++];

		// Don't need to copy second half

		// copy back to the original array to reflect sorted order
		for (i = low; i <= high; i++) {
			arr[i] = aux[i];
		}
		System.out.println(Arrays.toString(aux));
		System.out.println(Arrays.toString(arr));
		return inversionCount;
	}

	public static void main(String[] args)
	{
		int[] arr = { 1,3,5,7,4,6,8};
		int[] aux = Arrays.copyOf(arr, arr.length);

		// get inversion count by performing merge sort on arr
		System.out.println("Inversion count is " + 
				merge(arr, aux, 0, arr.length - 1));
	}
}
