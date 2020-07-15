package com.practiceQuestion;

import java.util.Arrays;

public class NumberOfOccurance1 {

	public static void NumberOfOccurance1(String str) {

		int count[] = new int[256];

		for (int i = 0; i < str.length(); i++) {
			int n = str.charAt(i);
			// System.out.println(n);
			count[n] = count[n] + 1;
		}
		System.out.println(Arrays.toString(count));
		for (int i = 0; i < 256; i++) {
			if (count[i] > 0) {
				// System.out.println((char)i);
				System.out.println((char) i + "  " + count[i]);
			}
		}
	}

	public static void NumberOfOccurance2(String str) {
		int count[] = new int[26];
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				count[str.charAt(i) - 65]++;
			} else if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				count[str.charAt(i) - 97]++;
			}
		}

		for (int i = 0; i < 26; i++) {
			if (count[i] > 0) {
				System.out.println((char) (i + 65) + "  " + count[i]);
			}
		}
	}

	public static void NumberOfOccurance3(String str) {

		char[] c = str.replaceAll("\\s+", "").toCharArray();

		for (int i = 0; i < c.length; i++) {
			int count = 0;
			for (int j = 0; j < c.length; j++) {
				if (j < i && c[i] == c[j]) {
					break;
				}
				if (c[i] == c[j]) {
					count++;
				}
			}
			if (count >= 1) {
				System.out.println(c[i] + "  " + count);
			}
		}

	}

	public static void main(String[] args) {
		// NumberOfOccurance1("MMMygoooooodddd luuuccckkkk");
		// NumberOfOccurance2("MMMygoooooommmdddd luuuccckkkk");
		NumberOfOccurance3("MMygoooommddd");
	}
}
