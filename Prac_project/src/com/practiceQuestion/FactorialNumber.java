package com.practiceQuestion;

import java.util.Scanner;

public class FactorialNumber {
	
	public static int fact(int n) {
		if(n==0 || n==1)
			return 1;
		return n*fact(n-1);
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int number= scanner.nextInt();
		
		int fact_number=fact(number);
		System.out.println("Factorial is "+fact_number);
		
		//Using loop
		int product=1;
		for(int i=1;i<=number;i++) {
			product= product*i;
		}
		System.out.println("Using Loop "+product);
	}
}
