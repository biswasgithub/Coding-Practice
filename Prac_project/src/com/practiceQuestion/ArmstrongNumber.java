package com.practiceQuestion;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		scanner.close();
		System.out.println(number);
		int remainder, n;
		int sum=0;
		n=number;
		
		//Armstrong Number
		while(number>0) {
			remainder=number%10;
			sum=sum+ (int)Math.pow(remainder, 3);
			number=number/10;
		}
		System.out.println("Sum  "+sum);
		
		if(n==sum) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong");
		}
		
		if(n%2==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd number");
		}
	}

}
