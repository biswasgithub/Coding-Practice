package com.hashing;

import java.util.HashSet;

public class SubsetArray {

	public static boolean isSubset(int A[], int B[]) {
		
		boolean result=true;
		
		HashSet<Integer> hset=new HashSet<Integer>();
		
		for(int i =0; i<A.length; i++) {
			if(!hset.contains(A[i])) {
				hset.add(A[i]);
			}
		}
		
		for(int i =0; i<B.length; i++) {
			if(!hset.contains(B[i])) {
				result=false;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int arr1[] = {11, 1, 13, 21, 3, 7}; 
        int arr2[] = {11, 3, 7};
        
        System.out.println("Is Subset: "+ isSubset(arr1, arr2));
	}
}
