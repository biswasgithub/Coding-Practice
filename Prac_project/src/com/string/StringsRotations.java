package com.string;

import java.util.Arrays;

public class StringsRotations {

	public static boolean isSame(String str1, String str2) {

		/*
		 * String[] arr1 = str1.split(""); String[] arr2 = str2.split(""); int count =
		 * 0; String temp = ""; boolean res = false; for (int i = 0; i < arr1.length;
		 * i++) { count++; temp = arr1[arr1.length - 1]; for (int j = arr1.length - 1; j
		 * > 0; j--) { arr1[j] = arr1[j - 1]; } arr1[0] = temp;
		 * System.out.println("No of rotation " + count + "   " +
		 * Arrays.toString(arr1)); if (!Arrays.equals(arr1, arr2)) {
		 * 
		 * } else { res = true; return res; } } return res;
		 */
		
		//  contains() check if String contains another substring(true) or not(false)
		String str3=str1+str1;
		if(str3.contains(str2))
			return true;
		else
			return false;
		
		//another approach: int indexOf(string str):- Returns the index of string str in a particular String.
		                   //returns -1 if the specified char/substring is not found in the particular String.
		//return (s1.length() == s2.length()) && ((s1+s1).indexOf(s2) != -1);
		
	}

	public static void main(String[] args) {
		String str1 = "12345";
		String str2 = "45123";
		String str3 = "alliswell";
		String str4 = "well";
		System.out.println(str3.contains(str4)+"  "+str3.indexOf(str4));
		
		boolean res = isSame(str1, str2);
		if (res)
			System.out.println(true);
		else
			System.out.println(false);
	}
}
