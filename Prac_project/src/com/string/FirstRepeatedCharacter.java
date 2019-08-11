package com.string;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FirstRepeatedCharacter {
	
	public char firstRepetedChar(char[] arr) {
		/*
		 * char c='\0'; for(int i=0;i<str.length()-2;i++) {
		 * if(str.charAt(i)==str.charAt(i+1)) { c=str.charAt(i); return c; } } return c;
		 */
		
		//using Set
		
		
		return '\0';
	}
	
	public static void main(String[] args) {
	
		String str="geeksforgeeks";
		char[] arr=str.toCharArray();
		FirstRepeatedCharacter obj=new FirstRepeatedCharacter();
		//har s=obj.firstRepetedChar(arr);
		System.out.println(obj.firstRepetedChar(arr));
	}
}
