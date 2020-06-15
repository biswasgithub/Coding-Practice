package com.practiceQuestion;

import java.util.Arrays;

public class ArrayRotation {

	public static int[] leftRotation(int[] arr, int n) {
		int temp;
		for(int i =1; i<=n ; i++) {
			temp=arr[0];
			for(int j=0; j<arr.length-1; j++) {
				arr[j]=arr[j+1];
			}
			arr[arr.length-1]=temp;
		}
		
		return arr;
	}
	
	public static int[] rightRotation(int[] arr, int n) {
		int temp;
		for(int i =1; i<=n ; i++) {
			temp=arr[arr.length-1];
			for(int j=arr.length-1; 1<=j; j--) {
				arr[j]=arr[j-1];
			}
			arr[0]=temp;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		int n=2;
		int[] result= leftRotation(arr,n);
		System.out.println("Left Rotation: "+ Arrays.toString(result));
		
		int[] result1= rightRotation(arr,n);
		System.out.println("Left Rotation: "+ Arrays.toString(result1));
	}
}
