package com.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {
	
	public static String ReverseWord(String str) {		
		String str1="";
		String[] arr=str.split("\\.");
		
		//using list
		/*
		 * List<String>list=Arrays.asList(arr); Collections.reverse(list);
		 * 
		 * for(int i=0;i<list.size()-1; i++) { str1=str1+list.get(i).concat("."); }
		 * return str1+list.get(list.size()-1);
		 */
		String s="";
		for(int i=arr.length-1; i>0;i--) {
			s=arr[i].toString().concat(".");
			str1=str1+s;
		}
		
		return str1+arr[0];
	}
	
	public static void main(String[] args) {
		String str="i.like.this.program.very.much";
		System.out.println("Before: "+ str);
		String rev_str=ReverseWord(str);
		System.out.println("After: "+rev_str);
	}

}
