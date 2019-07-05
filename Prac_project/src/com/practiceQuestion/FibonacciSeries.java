package com.practiceQuestion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FibonacciSeries {
	
	public static int fab(int n) throws InputMismatchException {
		if(n<=1)
			return n;
		return fab(n-1)+fab(n-2);
	}
	
	public static int fab_func(int n) {
		int a=0,b=1,c;
		if(n==0) 
			return n;
		for(int i=2;i<=n;i++) {
			c=a+b;
			a=b;
			b=c;
		}
		return b;
	}
	
	public static void main(String[] args) {
		int fab_number=0;
		Scanner scanner = new Scanner(System.in);
		int num= scanner.nextInt();
		scanner.close();
		try {
			fab_number=fab(num);
			System.out.println(fab_number);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		//using forfula Fn = {[(√5 + 1)/2] ^ n} / √5

		double phi= (1+Math.sqrt(5))/2;
		int fab_number1=(int)(Math.round(Math.pow(phi, num))/Math.sqrt(5));
		System.out.println("2nd approach "+fab_number1);
		
		// another approach
		
		int fab_num2= fab_func(num);
		System.out.println("3rd approach "+fab_num2);
	}
}
