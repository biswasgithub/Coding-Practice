package com.practiceQuestion;

import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println("Input: "+str);
		sc.close();
		int sum=0;
		
		for(int i=0; i<str.length()-1; i++) {
			if(Character.isDigit(str.charAt(i))) {
				String s=str.substring(i,i+1);
				int num=Integer.parseInt(s);
				sum+=num;
			}
		}
		System.out.println("Sum: "+sum);
	}
}
