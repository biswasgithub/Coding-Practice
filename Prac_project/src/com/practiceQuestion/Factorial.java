package com.practiceQuestion;

import java.util.Scanner;

public class Factorial {

	public static long fact(int n) {

		if (n == 0)
			return 1;
		if (n == 1)
			return 1;
		return n * fact(n - 1);
		
		// return (n==0 || n==1) ? 1 : n * fact(n-1);
		
	}

	public static long fact1(int n) {

		int result=1;
		for(int i=1; i<=n; i++) {
			result=result*i;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();

		System.out.println(fact(n));
		System.out.println(fact1(n));

	}
}
