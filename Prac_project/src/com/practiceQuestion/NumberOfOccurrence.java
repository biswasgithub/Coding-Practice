package com.practiceQuestion;

import java.util.HashMap;
import java.util.Scanner;

public class NumberOfOccurrence {
	
	public static void numberOfOccurrence(String str) {
		
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0; i<str.length(); i++) {
			
			char key=str.charAt(i);
			
			if(map.containsKey(key)) {
				map.put(key, map.get(key)+1);
			}
			else {
				map.put(key, 1);
			}
		}
		
		System.out.println(map);
	} 
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("Input: "+ str);
		sc.close();
		
		numberOfOccurrence(str);
	}
}
