package com.practiceQuestion;

import java.util.Scanner;

public class Palindrome {

	public static boolean isPalindrome(String str) {

		// method 1
		String result = "";
		int len = str.length();
		for (int i = len - 1; 0 <= i; i--) {
			result = result + str.charAt(i);
		}

		if (str.equalsIgnoreCase(result))
			return true;
		return false;
	}

	public static boolean isPalindrome1(String str) {

		// method 2
		StringBuilder stringBuilder=new StringBuilder(str);
		String str1=stringBuilder.reverse().toString();	

		if (str.equalsIgnoreCase(str1))
			return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println("Input: " + str);
		sc.close();

		System.out.println(isPalindrome(str));
		System.out.println(isPalindrome1(str));
	}
}
