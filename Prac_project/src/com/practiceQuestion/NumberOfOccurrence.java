package com.practiceQuestion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class NumberOfOccurrence {
	
	public static void numberOfOccurrence(String inputString) {
		
		char[] strArray = inputString.replaceAll("\\s+", "").toCharArray(); 
		System.out.println(Arrays.toString(strArray));
		LinkedHashMap<Character, Integer> charCountMap=new LinkedHashMap<Character, Integer>();		
		for (char c : strArray) { 
            if (charCountMap.containsKey(c)) { 
  
                // If char is present in charCountMap, 
                // incrementing it's count by 1 
                charCountMap.put(c, charCountMap.get(c) + 1); 
            } 
            else { 
  
                // If char is not present in charCountMap, 
                // putting this char to charCountMap with 1 as it's value 
                charCountMap.put(c, 1); 
            } 
        } 
		System.out.println(charCountMap);
	} 
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("Input: "+ str);
		sc.close();
		
		numberOfOccurrence(str);
	}
}
