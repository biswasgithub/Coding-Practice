package com.string;

public class CheckSubsequence {

	public static boolean isSubSequence(String str1, String str2, int str1_len, int str2_len) {

		// 1st approach

		if (str1_len == 0)
			return true;
		if (str2_len == 0)
			return false;

		if (str1.charAt(str1_len - 1) == str2.charAt(str2_len - 1)) {
			return isSubSequence(str1, str2, str1_len - 1, str2_len - 1);
		}
		return isSubSequence(str1, str2, str1_len, str2_len - 1);

		// 2nd approach
		/*
		 * int j=0; for(int i=0;i<n && j<m; i++) { if(str1.charAt(j)==str2.charAt(i))
		 * j++; }
		 * 
		 * return (j==m);
		 */
	}

	public static void main(String[] args) {
		String str1 = "gksmrek";
		String str2 = "geeksforgeeks";

		int m = str1.length();
		int n = str2.length();
		boolean res = isSubSequence(str1, str2, m, n);
		if (res)
			System.out.println(true);
		else
			System.out.println(false);
	}
}
