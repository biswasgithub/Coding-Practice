package com.practiceQuestion;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateCharacter {
	
	public static void removeDuplicate(String str) {
		LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
		for(int i=0; i<str.length()-1; i++) {
			hs.add(str.charAt(i));
		}
		
		for(Character c: hs) {
			System.out.print(c);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println("Input: "+ str);
		sc.close();
		
		removeDuplicate(str);
	}
}
