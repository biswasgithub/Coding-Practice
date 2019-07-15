package com.ArraysPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MaxMinValue {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int n = scanner.nextInt();
		System.out.println("Enter values");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		//using Arrays method
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Max value "+arr[arr.length-1]+"  2nd largest "+ arr[arr.length-2] +"  Min value "+arr[0]);
		
		//Using list
		List<Integer> list=Arrays.stream(arr).boxed().collect(Collectors.toList());
		System.out.println("Max "+Collections.max(list)+"  Min "+Collections.min(list));
		Collections.sort(list);
		//System.out.println("Max value "+list.get(list.size()-1))+"  Min value "+list.get(0);
		
		//by looping
		int max = arr[0];
		int second_largest=0;
		int min=arr[0];
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>max) {
				second_largest=max;
				max=arr[i];
			}
		}
		System.out.println("max: "+max+" 2nd largest "+second_largest);
		for(int i=0; i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Min "+ min);
		
	}

}
