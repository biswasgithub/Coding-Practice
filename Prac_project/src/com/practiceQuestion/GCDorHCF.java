package com.practiceQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GCDorHCF {
	
	static int hcf(int a, int b) {
		if(a==b)
			return a;
		if(a>b)
			return hcf(a-b,b);
		return hcf(a,b-a);
		
	}
	
	public static void main(String[] args) {

		int a = 40, b = 60, remainder;
		int HCF = hcf(a,b);
		System.out.println("HCF "+HCF);
		
		System.out.println("LCM "+ (a*b)/HCF);
		
		//concating and palindrome check
		String str1="Goog";
		String str2=" Morning";
		System.out.println(str1.concat(str2));
		
		StringBuilder builder=new StringBuilder(str1);
		String reverse = builder.reverse().toString();
		if(str1.equalsIgnoreCase(reverse))
			System.out.println("True");
		System.out.println("False");
		
		int[] arr=new int[] {1,2};
		
		//reverse string
		char[] char_str1=str1.toCharArray();
		String rev="";
		for(int i =char_str1.length-1;i>=0;i--) {
			 rev=rev+ char_str1[i];
		}
		System.out.println("Reverse: "+rev);
		
		List<char[]> list = Arrays.asList(char_str1); 
		list.forEach(i-> System.out.println(i));
		
		int n=673, sum=0;
		
		while(n!=0) {
			sum = sum+n%10;
			n=n/10;
		}
		System.out.println(sum);
		
		List list7=new ArrayList<>();
	
	}

}
