package com.string;

public class SumOfNumbers {

	public static void main(String[] args) {
		String str = "go2to4School6play3football5";
		
		int sum=0;
		for(int i=0; i<str.length();i++) {
			
			char c=str.charAt(i);
			if(Character.isDigit(c)) {
				int b = Integer.parseInt(String.valueOf(c));
				sum+=b;
			}
		}
		System.out.println(sum);
	}
	
}
