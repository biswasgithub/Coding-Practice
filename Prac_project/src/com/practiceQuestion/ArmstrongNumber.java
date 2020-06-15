package com.practiceQuestion;

import java.util.Scanner;

public class ArmstrongNumber {

	public static boolean isArmstrong(int number) {

		int remainder;
		int result = number;
		int sum = 0;

		while (number > 0) {
			remainder = number % 10;
			sum = sum + (int) Math.pow(remainder, 3);
			number = number / 10;
		}
		if (sum == result)
			return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();

		System.out.println(isArmstrong(n));

	}

}
