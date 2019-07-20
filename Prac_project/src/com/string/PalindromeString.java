package com.string;

public class PalindromeString {
	
	public static boolean IsPalindrome(String str) {
		String str1="";
		
		int length=str.length();
		for(int i=str.length()-1 ; i>=0 ; i--) {
			str1=str1+str.charAt(i);
		}
		System.out.println(str1);
		if(str.equalsIgnoreCase(str1))
			return true;
		return false;
	}
		
	public static void main(String[] args) {
		String str="Moon";
		StringBuilder stringBuilder=new StringBuilder(str);
		String str1=stringBuilder.reverse().toString();
		if(str.equalsIgnoreCase(str1))
			System.out.println(true);
		System.out.println(false);
		System.out.println("Is Palindrome: "+IsPalindrome("Mallm"));
	}
}
