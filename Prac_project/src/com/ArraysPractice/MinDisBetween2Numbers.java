package com.ArraysPractice;

import java.util.Arrays;

public class MinDisBetween2Numbers {

	public static void main(String[] args) {
		int arr[] = new int[] {5,8,3,2};
		Arrays.sort(arr);
		System.out.println("Min "+ (arr[1]-arr[0]));
		System.out.println("Max "+ (arr[arr.length-1]-arr[0]));

		int array[] = {12, 11, 10, 5, 6, 2, 30};
		
		int count1=0;
		for(int i=0;i<array.length-2;i++) {
			if(array[i]<array[i+1] && array[i+1]<array[i+2]) {
				count1++;
			}
		}
		System.out.println(count1);
	}
}
