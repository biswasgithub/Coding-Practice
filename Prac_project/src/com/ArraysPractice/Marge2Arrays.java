package com.ArraysPractice;

import java.util.Arrays;

public class Marge2Arrays {
	
	public static void main(String[] args) {
		int[] arr1= {1, 5, 9, 10, 15, 20};
		int[] arr2= {2, 3, 8, 13};
		
		int[] res = new int[arr1.length + arr2.length];
		
		int i=0, j=0,k=0;
		
		while(i<arr1.length && j<arr2.length ) {
			if(arr1[i] < arr2[j]) {
				res[k]=arr1[i];
				i++;k++;
			}
			else {
				res[k]=arr2[j];
				k++;j++;
			}
		}
		
		while(i<arr1.length) {
			res[k++]=arr1[i++];
		}
		
		while(i<arr2.length) {
			res[k++]=arr2[i++];
		}
		
		System.out.println(Arrays.toString(res));
	}
}
