package com.Mathematical;

public class SumOfDigits {
	public static void main(String[] args) {
		int num=153;
		int num1=num;
		int sum=0,sum1=0,remainder, armstrongSum=0;
		while(num>0) {
			remainder=num%10;
			sum=sum+remainder;
			armstrongSum = armstrongSum+(remainder*remainder*remainder);
			num=num/10;
		}
		
		int sumOfDigits=sum;
		
		while(sum>0) {
			remainder=sum%10;
			sum1=(sum1*10)+remainder;
			sum=sum/10;
		}
		System.out.println("Original Sum:  "+sumOfDigits);
		System.out.println("Reverse Sum:  "+sum1);
		System.out.println("Armstrong Sum:  "+armstrongSum);
		System.out.print("Is num Armatrong:  ");
		System.out.println(armstrongSum==num1);
		
		System.out.println(sumOfDigits==sum1);
		
		Double obj1=new Double(sumOfDigits);
		Double obj2=new Double(sum1);
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1==obj2);
		System.out.println(String.valueOf(sumOfDigits).equals(String.valueOf(sum1)));
		
		
	}

}
