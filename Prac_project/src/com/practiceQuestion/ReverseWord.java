package com.practiceQuestion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter inputs: ");
		String str=sc.nextLine();
		sc.close();
		
		String[] strArr=str.split(" ");
		String result="";
		for(int i=strArr.length-1; i>=0  ; i--) {
			result=result+strArr[i]+" ";
		}
		System.out.println(result);
		
		
		//Using collections
		List<String> list=Arrays.asList(strArr);
		Collections.reverse(list);
		System.out.println(list);
		
	}
}
