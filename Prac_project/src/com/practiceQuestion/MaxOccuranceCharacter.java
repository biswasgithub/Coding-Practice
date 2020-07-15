package com.practiceQuestion;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MaxOccuranceCharacter {
	
	public static void maxOccuranceCharacter(String inputString) {
		
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
		
		int max=0;
		Character key1='\0';
		Set<Entry<Character,Integer>> entryMap=charCountMap.entrySet();
		System.out.println(entryMap);
		for(Entry<Character,Integer> entry: entryMap) {
			if(entry.getValue()>max) {
				max=entry.getValue();
				key1=entry.getKey();
			}
		}
		System.out.println("Max Occurence of Character: "+ key1 +" "+max);
	}
	
	public static void main(String[] args) {
		
		maxOccuranceCharacter("Java Concept Of The Day");
	}
}
