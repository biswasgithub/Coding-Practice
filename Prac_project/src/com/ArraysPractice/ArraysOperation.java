package com.ArraysPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysOperation {
	
	public boolean search(int a[], int x) {
		
		for(int m: a) {
			if(m==x) {
				return true;
			}
		}
		return false;
	}
	
	public boolean adding(int a[],int ele,int index) {
		
		if(index>=0 && index<=a.length) {
			a[index]=ele;
			return true;
		}
		return false;
	}
	
	public boolean delete(int a[], int ele) {
		
		List<Integer> list= new ArrayList<>();
		for(int e:a) {
			list.add(e);
		}
		
		if(list.contains(ele)) {
			list.remove(new Integer(ele));
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		int a[]= new int[] {5,7,85,6,45,25};
		int a1[]= new int[a.length] ;
		ArraysOperation obj=new ArraysOperation();
		System.out.println("searching: " +obj.search(a,45));
		System.out.println("Adding "+obj.adding(a,20,3) +"  "+Arrays.toString(a));
		System.out.println("Delete "+obj.delete(a,5) +"  "+Arrays.toString(a));
		
		for(int i=0; i<a1.length; i+=2) {
			System.out.println(a[i]);
		}
		
		List<Integer> list = new ArrayList<Integer>();
		for(int e:a) {
			list.add(e);
		}
		Collections.reverse(list);
		a=list.stream().mapToInt(Integer::intValue).toArray();
		System.out.println(Arrays.toString(a));
		
		for(int i=a.length-1;i>=0;i--) {
			
		}
	}

}
