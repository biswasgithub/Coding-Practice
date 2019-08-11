package com.Mathematical;

public class ClosestNumber {

	public static void main(String[] args) {
		
		int m=21,n=6;
		/*
		 * if(m>=n) { while(m>0) { if(m%4!=0) { m=m-1; } else { result=m; break; } } }
		 * System.out.println(result);
		 */
		
		//use this approach
		int closestDivisibleNumber=0;
		int quotient=m/n;
		
		// find number that is divisible by n and number<m;
		int n1=quotient*n; 
		System.out.println("n1: "+n1);
		// find number that is divisible by n and number>m;
		int n2=0;
		if(m*n>0)
			n2=n*(quotient+1);
		else
			n2=n*(quotient-1);
		System.out.println("n2: "+n2);
		if((m-n1)<=(n2-m))
			closestDivisibleNumber=n1;
		else
			closestDivisibleNumber=n2;
		System.out.println(closestDivisibleNumber);
		
		
	}
}
