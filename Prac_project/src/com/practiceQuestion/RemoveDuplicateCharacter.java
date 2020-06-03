package com.practiceQuestion;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateCharacter {
	
	public static void removeDuplicate(String inputString) {
		char[] strArray = inputString.replaceAll("\\s+", "").toCharArray(); 
		LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
		for(char ch: strArray) {
			hs.add(ch);
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
		
		removeDuplicate("Java");
	}
}
